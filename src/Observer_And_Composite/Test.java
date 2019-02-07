public class Test {

    public static void main(String[] args) {

        CompanyOne company = new CompanyOne();
        Person person1 = new Person();
        Person person2 = new Person();
        company.registe(person1);
        company.registe(person2);

        company.setPriceFacebook(212.1);
        company.setPriceMicrosoft(333.0);

        Observer group1 = new GropupOfPeople();
        ((GropupOfPeople) group1).add(new Person());
        ((GropupOfPeople) group1).add(new Person());
        ((GropupOfPeople) group1).add(new Person());
        company.registe(((GropupOfPeople) group1).getGroup());

        company.setPriceMicrosoft(1111.1);


    }
}
