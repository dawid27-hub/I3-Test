package tablebind

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class DeductionServiceSpec extends Specification {

    DeductionService deductionService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Deduction(...).save(flush: true, failOnError: true)
        //new Deduction(...).save(flush: true, failOnError: true)
        //Deduction deduction = new Deduction(...).save(flush: true, failOnError: true)
        //new Deduction(...).save(flush: true, failOnError: true)
        //new Deduction(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //deduction.id
    }

    void "test get"() {
        setupData()

        expect:
        deductionService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Deduction> deductionList = deductionService.list(max: 2, offset: 2)

        then:
        deductionList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        deductionService.count() == 5
    }

    void "test delete"() {
        Long deductionId = setupData()

        expect:
        deductionService.count() == 5

        when:
        deductionService.delete(deductionId)
        sessionFactory.currentSession.flush()

        then:
        deductionService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Deduction deduction = new Deduction()
        deductionService.save(deduction)

        then:
        deduction.id != null
    }
}
