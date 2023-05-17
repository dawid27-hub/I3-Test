package tablebind
import grails.transaction.Transactional
import groovy.json.JsonSlurper
import org.springframework.web.client.RestTemplate

@Transactional
class CurrencyConversionService {

    static final API_URL = "http://data.fixer.io/api/latest"
    static final API_KEY = "gczwTlUyxy10MoNTZgL1Qx8G7HSss2Zm"
    static final TARGET_CURRENCY_CODE = "USD"
    RestTemplate restTemplate = new RestTemplate()

    def Convert(double amount) {
        def url = "${API_URL}?access_key=${API_KEY}&symbols=${TARGET_CURRENCY_CODE}"
        def response = restTemplate.getForObject(url, String.class)
        def jsonSlurper = new JsonSlurper()
        def jsonResponse = jsonSlurper.parseText(response)

        def targetCurrencyRate = jsonResponse.rate[TARGET_CURRENCY_CODE]
        return amount * targetCurrencyRate
    }

}
