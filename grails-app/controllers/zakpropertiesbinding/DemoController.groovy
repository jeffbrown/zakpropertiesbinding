package zakpropertiesbinding

class DemoController {

    def index() {
        def details = new OrganizationDetails(name: 'Some Name',
                description: 'Some Description',
                shortName: 'Some Short Name')

        def org = new Organization()
        org.properties = details.properties

        render "Short Name: ${org.shortName}"
    }
}
