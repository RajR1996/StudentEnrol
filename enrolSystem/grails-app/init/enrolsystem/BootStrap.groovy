package enrolsystem

class BootStrap {

    def init = { servletContext ->
new Module(title: "Sport", code: "S", credits: "120", Lecturer: "Randomer", Description: 'this is physical education.').save()

    }
    def destroy = {
    }
}
