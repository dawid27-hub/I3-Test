package tablebind



class DeductionController {

    def index() {
        render(view: 'index')
    }

    def login() {
        String userlogin = params.userlogin
        BigDecimal totalamount = params.totalamount as BigDecimal
        render(view: 'calculate')
    }

    def calculate() {
        String name = params.name
        BigDecimal total = params.total as BigDecimal
        BigDecimal amount = params.amount as BigDecimal
        String time = params.time
        BigDecimal targetCurrencyRate = 0.0725
        BigDecimal convert = amount*targetCurrencyRate
        BigDecimal result = total - amount

        Map model = [
                name: name,
                total: total,
                amount: amount,
                time: time,
                result: result,
                convert: convert
        ]

        if (params.download == 'true') {
            response.setContentType("text/csv")
            response.setHeader("Content-Disposition", "attachment; filename=deduction.csv")
            response.outputStream << "Name,Total,Withdraw Amount,Time of withdraw,Total Left, Withdraw Converted\n"
            response.outputStream << "${name},${total},${amount},${time},${result},${convert}\n"
        } else {
            render(view: 'result', model: model)
        }
    }
}
