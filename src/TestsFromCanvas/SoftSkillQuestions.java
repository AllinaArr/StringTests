package TestsFromCanvas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SoftSkillQuestions {
    ArrayList<String> names = new ArrayList<>();
    public static void main(String[] args) {
        Random r = new Random();

        ArrayList<String> question = new ArrayList<>();
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
        question.add("90.What is manual testing?");
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

