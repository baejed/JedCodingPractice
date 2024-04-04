public class TestClass {

    static int numOfInstances = 0;
    int hello = 0;

    TestClass() {
        numOfInstances++;
    }

    void destroyClass(){
        hello += numOfInstances;
    }

}
