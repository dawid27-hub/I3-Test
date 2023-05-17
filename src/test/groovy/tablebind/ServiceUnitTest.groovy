package tablebind

import grails.testing.services.ServiceUnitTest

class Convert extends CurrencyConversionService  {
    void ZartoUSD() {
        service.httpClient = Mock(RESTClient)

        def responseJson = """
            {
                "rate": {
                    "USD": 0.0725
                }
            }
        """

        def result = service.convertZarToUsd(100)
        assertEquals 7.25, result
    }
}
