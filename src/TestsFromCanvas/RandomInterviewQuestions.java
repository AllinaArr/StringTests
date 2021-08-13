package TestsFromCanvas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomInterviewQuestions {
    ArrayList<String> names = new ArrayList<>();

    public RandomInterviewQuestions(String... name) {
        names.addAll(Arrays.asList(name));
    }

    public static void main(String[] args) {
        Random r = new Random();

        ArrayList<String> question = new ArrayList<>();
        question.add("1.What is the difference between JDK, JRE, and JVM?+");
        question.add("2.Why is the main method static?" +
                "\n public : “public” is an access specifier which can be used outside the class. When main method is declared public it means it can be used outside class.\n" +
                "\n static : To call a method we require object. Sometimes it may be required to call a method without the help of object. Then we declare that method as static. JVM calls the main() method without creating object by declaring keyword static.\n" +
                "\n void : void return type is used when a method does’nt return any value . main() method does’nt return any value, so main() is declared as void.\n" +
                "\n Signature : public static void main(String[] args) {");
        question.add("3.What are constructors in Java?+");
        question.add("4.Can we execute a program without main()method?");
        question.add("5.What is an object?");
        question.add("6.Object vs Class?+");
        question.add("7.What is the difference between stack and heap?");
        question.add("8.Can we overload the constructors?");
        question.add("9.Can we make constructors static?");
        question.add("10.What is the purpose of methods and how are used?");
        question.add("11.Difference between a Constructor and a Method?+");
        question.add("12.What is immutable?+");
        question.add("13.What is Array?+");
        question.add("14.Array vs ArrayList?");
        question.add("15.What are Wrapper classes?");
        question.add("16.Important String Methods?+");
        question.add("17.Do you know typecasting? What is casting?");
        question.add("18.AutoBoxing?");
        question.add("19.UnBoxing?");
        question.add("20.What loop types are there and how do they behave?");
        question.add("21.Why is String immutable. What is the String pool?");
        question.add("22.Data types and differences?");
        question.add("23.How can you print from 1 to 100 without using a loop?");
        question.add("24.Difference between methodOverloading and methodOverriding?+");
        question.add("25.Can you tell me how to convert a String to an integer and an integer to a String in Java?");
        question.add("26.What is the difference between equals() and == in Java?");
        question.add("27. What are access modifiers in Java? (public, protected, default, private)?+");
        question.add("28.What is inheritance in Java?+");

        question.add("29.What is the difference between procedure and function?");
        question.add("30. What is unit testing and who does that?+");
        question.add("31. What is functional testing?+");
        question.add("32. How to tell if the requirement is good or not?+");
        question.add("33. What is the difference between regression and retest?+");
        question.add("34. What is smoke test?+");
        question.add("35. Who runs the smoke test?+" +
            "QA lead/QA engineers");
        question.add("36. How long does your smoke test take to run?+" +
                "\nYou need to be thinking about 30 minutes – or at most 60 minutes – as duration of Smoke Tests.\n" +
                "\nAny longer, and you can be sure something is wrong.\n" +
                "\n Either the code is of such poor quality, or your test cases aren’t simple enough.\n");
        question.add("37. How many scenarios does your smoke test have?");
        question.add("38. Where do we run smoke test?");
        question.add("39. What is white box testing?+");
        question.add("40. What is black box testing?+");
        question.add("41. What is difference between TC and TS?");
        question.add("42. Tell me about your project?");
        question.add("43. what you do while developer developing the code?");
        question.add("44. How many environments you have in your project?");
        question.add("45. What are the phases / steps of SDLC/?+");
        question.add("46. What are the disadvantages of waterfall?+");
        question.add("47.What do you like about agile?" +
                "\n 1-Welcome Changing Requirements Even Late in the Project\n " +
                "\n 2-The Most Effective Way of Communication is Face-to-face" +
                "\n 3-Deliver working software frequently, from a couple of weeks to a couple of months, with a preference to the shorter timescale.");
        question.add("48.What challenges can you have while working in agile environment?+");
        question.add("49.Who accepts user stories?");
        question.add("50.Describe me your team?");
        question.add("51.What do you like about being part of scrum team?");
        question.add("52.What is your team size?");
        question.add("53.What is product backlog?");
        question.add("54.What is sprint backlog?");
        question.add("55.How long is you sprint?");
        question.add("56.Tell me about sprint grooming?");
        question.add("57.Tell me about sprint planning?");
        question.add("58.Tell me about daily stand up?");
        question.add("59.Tell me about retro meeting?");
        question.add("60.How often do you have releases?");
        question.add("61.What is definition of ready?");
        question.add("62.What is definition of done?");
        question.add("63.What is Epic?" +
                "\n Epic is a big requirement from the customer which we can divide by small user story. And the Epic can't be completed by 1 Sprint");
        question.add("64.What is user story?"+
                "\n  A user story is the smallest unit of work in an agile framework. " +
                "It's an end goal, not a feature, expressed from the software user's perspective. " +
                "A user story is an informal, general explanation of a software feature written from the perspective of the end user or customer.");
        question.add("65.What is AC?");
        question.add("66.What is increment?");
        question.add("67.What is testing?");
        question.add("68.What is manual testing?");
        question.add("69.What is automated testing?");
        question.add("70.What is static testing?");
        question.add("71.What is verification?+");
        question.add("72.What is dynamic testing and what is static testing?");
        question.add("73.What is dynamic testing?");

        question.add("74.What is front-end?");
        question.add("75.What is back-end?");
        question.add("76.What is HTML?");
        question.add("77.What is a TAG?");
        question.add("78.How many types of tags we have in HTML?");
        question.add("79.What is a web element?");
        question.add("80.What is automation?");
        question.add("81.How does automating tests help us?");
        question.add("82.What is Selenium?");
        question.add("83.Is Maven for testers?");
        question.add("84.What is Maven?");
        question.add("85.What Java version are you using?");
        question.add("86.What Selenium version are you using?");
        question.add("87.What WebDriverManager version are you using?");
        question.add("88.What is a build?");
        question.add("89.What do we test as testers?");

        question.add("90.What is manual testing?");

        question.add("91.Is maven the only Build automation tool?");
        question.add("92.What 'find.elements' return?");
        question.add("93.What '.getAttribute()' return?");
        question.add("94.What 'find.element' accepts as parameter?");
        question.add("95.When 'NoSuchElementException' is throw?");
        question.add("96.Can you tell me about the common exceptions you are facing when you are using JAVA+SELENIUM?");
        question.add("97.What '.getAttribute() does it do?");
        question.add("98.What is a bite code?");
        question.add("99.HOW TO MOVE FROM PARENT TO CHILD USING CSSSELECTOR?");
        question.add("100.How many types of xpath locators we have?");
        question.add("101.HOW CAN YOU GO FROM CHILD TO PARENT IN XPATH? WHAT ABOUT FORM PARENT TO CHILD?");
        question.add("102.How do we move from parent to ANY CHILD?");
        question.add("103.How do you handle dynamic web elements?");
        question.add("104.How do you handle web elements that has dynamic attribute value?");
        question.add("105.What '.implicitWait()' does do?");
        question.add("106.What is TestNG?");
        question.add("107.What is Assertions on TestNG");
        question.add("108.What is Annotations in TestNG?");
        question.add("109.HOW TO HANDLE DROPDOWNS USING SELENIUM?");
        question.add("110.How many dropDowns in Selenium do you know?");
        question.add("111.How many Select ways are to select from a DROPDOWN?");
        question.add("112.Is TestNG the only unit testing framework?");
        question.add("113.What are the common annotations?");
        question.add("114.How do we select from a <select> dropdown?");
        question.add("115.How do we verify the currently selected option form a DropDown?");
        question.add("116.How to get all of the options from a dropdown?");
        question.add("117What is an iframe?");
        question.add("118.How to get all of the handles of currently opened windows in Selenium?");
        question.add("119.How many different types of alerts are there?");
        question.add("120.How many different type of JS Alert are?");
        question.add("121.How many ways we have to switch to iframes?");
        question.add("122.What is a window handle in Selenium?");
        question.add("123.What is dynamic web element in Selenium?");
        question.add("124.How to move from sibling to sibling in Selenium?");
        question.add("125.HOW DO WE CREATE WEB TABLES IN SELENIUM?");
        question.add("126.HOW DO WE HANDLE WEB TABLES USING SELENIUM?");
        question.add("127.What is hard coding?");
        question.add("128.What is Properties file? What is the type of the Property file?");
        question.add("129.What is Sprint Increment? What about Product Increment?");
        question.add("130.What are the popular topics for java Interview?+");
        question.add("131.What aew the advanced Java Topics?+");
        question.add("132.Which class is the superclass of all classes?+");
        question.add("133.What is the difference between a local variable and an instance variable?+");
        question.add("134.Object Oriented Programming?+");
        question.add("135.What is encapsulation and how did you use it?+");
        question.add("136.What is the concept of Abstraction?+");
        question.add("137.Difference between Abstraction and Encapsulation?+");
        question.add("138.Difference between Abstract and Interface?+");
        question.add("139.What is Polymorphism?+");
        question.add("140.Important terminology in inheritance?+");
        question.add("141.Difference between Polymorphism and Inheritance?+");
        question.add("142.WHAT IS STATIC binding vs dynamic/runtime binding?+");
        question.add("143.Difference between Set, List and Map in Java?+");
        question.add("144.When to use List, Set, and Map?+");
        question.add("145.How do you find if ArrayList contains duplicates or not?+");
        question.add("146.Difference between Array and ArrayList?+");
        question.add("147.What is thread safe or Synchronized?+");
        question.add("148.How do you sort an object that you created?+");
        question.add("149.Difference between Hashtable and HashMap in Java?+");
        question.add("150.How do you handle Exception?+");
        question.add("151.TreeSet vs TreeMap?+");
        question.add("152.final vs finalize vs finally?+");
        question.add("153.Difference between Error and Exception in Java?+");
        question.add("154.Difference between RuntimeException a nd checkedException in Java?+");
        question.add("155.Difference between throw and throws in Java?+");
        question.add("156.StringBuffer and StringBuilder?+");
        question.add("157.What is finalize?+");
        question.add("158.What is final keyword?+");
        question.add("159.What is static keyword?+");
        question.add("160.What is system.gc()?+");
        question.add("161.What is thw difference between IS-A and HAS-A relationship?+");
        question.add("162.What is iterator  a nd difference between for each loop?+");
        question.add("163.Java Collection Framework?+");
        question.add("164.How to convert float to string?+");
        question.add("165.Let's say you have an int b=3 a=4 how can you swap them?+");
        question.add("166.Do you know typecasting? What's casting?+");
        question.add("167.What is the output for this program?+");
        question.add("168.How do you use an abstract class in your project, give ma am example?+");
        question.add("169.What is difference between pass-by-value and pass-by-reference? pass by value & pass by reference?++");


        question.add("170.What is Software Testing?+");
        question.add("171.Why we test?+");
        question.add("172.What is Software Requirements Specification?+");
        question.add("173.What is Software Testing Life Cycle?+");
        question.add("174.What is different STLC and SDLC?+");
        question.add("175.Is 100% testing possible?+");
        question.add("176. Agile framework?+");
        question.add("177. What's agile?+");
        question.add("178. Do you know about Agile Manifestro & its Principles?+");
        question.add("179. What is requirements?+");
        question.add("180. What kind of Agile methodology did you use in previos projects?+");
        question.add("181. Scrum is an Agile Framework, right? Name few other Agile Framework?+");
        question.add("182. What are the different roles in Scrum? Scrum roles?+");
        question.add("183. What are the responsibilities of a Scrum Master?+");
        question.add("184. What do you understand by the term Scrum of Scrums?+");
        question.add("185. Where is the requirement coming from?+");
        question.add("186. When the testing starts?+");
        question.add("187. What is tester's main responsibility?+");
        question.add("188. What is the job responsibility of a tester or Software Development Engineering in test role?+");
        question.add("189. What is Validation?+");
        question.add("190. Agile experience in your most recent project?+");
        question.add("191. What is positive testing? Happy Path testing?+");
        question.add("192. What is testing hierarhy?+");
        question.add("193. What is 508 Compliance testing?+");
        question.add("194. What is risk-based testing?+");
        question.add("195. How long did it take to build this regression test?+");
        question.add("196. Tell us challenge with running regression suite?+");
        question.add("197. How many environments do you have?+");
        question.add("198. Which part pf regression test should be automated?+");
        question.add("199. How do you ensure that your regression test are effective?+");
        question.add("200. A number of critical bugs are fixed in software. All the bugs are in one modele, related to reports. The test manager decideds to do regression testing only on the report's module?+");
        question.add("201. Which technique can be used to achive inout and output coverage?+");
        question.add("202. How do you run your regression?+");
        question.add("203. What is Equivalence partitioning testing?+");
        question.add("204. What is Boundary value testing?+");
        question.add("205. Why does the boundary value analysis provide good test cases?+");
        question.add("206. Why we use decision tables?+");
        question.add("207. In white box testing what do we verify?+");
        question.add("208. What is grey box testing?+");
        question.add("209. What the difference between static and dynamic testing?+");
        question.add("210. What is maintenece testing?+");
        question.add("211. What is Integration Testing?+");
        question.add("212. What is Scalability Testing?+");
        question.add("213. What is Storage Testing?+");
        question.add("214. What is Stress Testing?+");
        question.add("215. What is Test Harness?+");
        question.add("216. What is test coverage?+");
        question.add("217. What is a V-Model?+");
        question.add("218. Which of the following is likely to benifit most from the use tools provideing test capture and replay facilities?+");
        question.add("219. What is Acceptance Testing?+");
        question.add("220. What is the difference between UAT?+");
        question.add("221. What is continious integration?+");
        question.add("222. How is code deployed to production environment?+");
        question.add("223. What is a negative test case?+");
        question.add("224. Shippable product/increment?+");
        question.add("225. What is BurnDown Chart?+");
        question.add("226. What is parking lot?+");
        question.add("227. What is sprint workflow?+");
        question.add("228. What is Acceptance criteria?+");
        question.add("229. What is rat hole?+");
        question.add("230. What types of Test cases?+");
        question.add("231. What is test case?+");
        question.add("232. How many Test Cases (in your regr suite) do you compliate in 1 week?+");
        question.add("233. How long it will take to run your regression suite?+");
        question.add("234. What do you  do when you run your automated script or what do you when you run regression?+");
        question.add("235. What are the steps you take to automate?+");
        question.add("236. What percentage of position is automation and manual?+");
        question.add("237. When do you choose automated testing over manual testing?+");
        question.add("238. When do you do automation in your sprint?+");
        question.add("239. What is Test Plan?+");
        question.add("240. What are the tables in test plans?+");
        question.add("241. What is the difference between a test plan and a QA plan?+");
        question.add("242. What is a peer review?+");
        question.add("244. Who approves test cases?+");
        question.add("245. Who writes test plans ans test cases?+");
        question.add("246. What is the purpose of test design technique?+");
        question.add("247. Difference between test case and test script?+");
        question.add("248. What should be included in a test strategy?+");
        question.add("249. What will you do when script fails?+");
        question.add("250. What is Test Scenario?+");
        question.add("251. Requirement Traceability Matrix?+");
        question.add("252. What are the functional testing types?+");
        question.add("253. What is difference between sanity testing and smoke testing?+");
        question.add("254. What steps are involved in sanity testing?+");
        question.add("255. What is the difference between WinRunner and Rational Robot?+");
        question.add("256. What is the difference between QA and testing?+");
        question.add("257. Explain random testing?+");
        question.add("258. What is difference between quality Control and Quality Assurance?+");
        question.add("259. What is the role of QA in a project development?+");
        question.add("260. What makes a good QA or  Test Manager?+");
        question.add("261. Explain the difference between bug severity and bug priority?+");
        question.add("262. What is the difference between system testing and integration testing?+");
        question.add("263. What is the difference between functional testing and structural testing?+");
        question.add("264. What is the difference between Pilot and Beta testing?+");
        question.add("265. What is Alpha testing?+");
        question.add("266. What is a failure?+");
        question.add("267. What are Test Comparators?+");
        question.add("268. Describe how to perform Risk analysis during software testing?+");
        question.add("269. What is Silk Test?+");
        question.add("270. What is the difference between Master Test Plan and Test Plan?+");













        RandomInterviewQuestions players = new RandomInterviewQuestions("Player1", "Player2");  // <-- delete or add more Players in here
        int randomQuestion = r.nextInt(question.size());
        int randomName = r.nextInt(players.names.size());

        System.out.println(players.names.get(randomName) + " -> " + question.get(randomQuestion));


//      Have fun!!!

    }
}

