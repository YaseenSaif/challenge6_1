open class Employee(name:String,age:Int,salary:Double)
{
    var name:String
    var age:Int
    var salary:Double
    init
    {
        this.name=name
        this.age=age
        this.salary=salary
    }

    fun name(){
        println("Name of employee is $name")
    }
    fun age(){
        println("Age of employee is $age")
    }
    fun salary(){
        println("Salary of employee is $salary")
    }
}

class WebDeveloper(name:String,age:Int,salary:Double):Employee(name,age,salary)
{
    fun webSite()
    {
        println("I am a webSite developer")
    }
}
class AndroiedDeveloper(name:String,age:Int,salary:Double):Employee(name,age,salary)
{
    fun androied()
    {
        println("I am an Android developer")
    }
}
class IOSDeveloper(name:String,age:Int,salary:Double):Employee(name,age,salary)
{
    fun iOSApp()
    {
        println("I am an iOS developer")
    }

}

fun main()
{

    var Emp1=WebDeveloper("Ziad",25,2500000.0)
    var Emp2=AndroiedDeveloper("Omar",22,200000.0)
    var Emp3=IOSDeveloper("Abdulrahman",26,400000.0)
    Emp1.name()
    Emp1.webSite()
    Emp2.name()
    Emp2.androied()
    Emp3.name()
    Emp3.iOSApp()

}
