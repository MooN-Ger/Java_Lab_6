import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionsDemoTest {

    @Test
    public void testGetCountStringsStartsWithChar() {
        ArrayList<String> strTest = new ArrayList<String>();
        strTest.add("One");
        strTest.add("Two");
        strTest.add("Three");
        strTest.add("Four");
        strTest.add("Five");
        char chTest = 'F';

        assertEquals(2, CollectionsDemo.getCountStringsStartsWithChar(strTest, chTest));
    }

    @Test
    public void testGetListOfSameSurname() {
        Human humanTest1 = new Human("Vasia", "Vasiliev", "Vasilievich", 20);
        Human humanTest2 = new Human("Peter", "Petrov", "Petrovich", 33);
        Human humanTest3 = new Human("Alex", "Petrov", "Alexov", 41);
        Human humanTest4 = new Human("Kirill", "Chernov", "kirillovich", 11);
        Human humanTest5 = new Human("Vladimir", "Chernov", "Vladimirovich", 55);

        Human targetHumanTest = new Human("Andrey", "Petrov", "Alexandrovich", 25);

        ArrayList<Human> humanTestList = new ArrayList<Human>();
        humanTestList.add(humanTest1);
        humanTestList.add(humanTest2);
        humanTestList.add(humanTest3);
        humanTestList.add(humanTest4);
        humanTestList.add(humanTest5);

        ArrayList<Human> expectedHumanList = new ArrayList<Human>();
        expectedHumanList.add(humanTest2);
        expectedHumanList.add(humanTest3);

        assertEquals(expectedHumanList, CollectionsDemo.getListOfSameSurname(humanTestList, targetHumanTest));
    }

    @Test
    public void testGetCopyOfHumanList() {
        Human humanTest1 = new Human("Vasia", "Vasiliev", "Vasilievich", 20);
        Human humanTest2 = new Human("Peter", "Petrov", "Petrovich", 33);
        Human humanTest3 = new Human("Alex", "Petrov", "Alexov", 41);
        Human humanTest4 = new Human("Kirill", "Chernov", "kirillovich", 11);
        Human humanTest5 = new Human("Vladimir", "Chernov", "Vladimirovich", 55);

        ArrayList<Human> humanTestList = new ArrayList<Human>();
        humanTestList.add(humanTest1);
        humanTestList.add(humanTest2);
        humanTestList.add(humanTest3);
        humanTestList.add(humanTest4);
        humanTestList.add(humanTest5);

        ArrayList<Human> expectedList = new ArrayList<Human>();
        expectedList.add(humanTest1);
        expectedList.add(humanTest2);
        expectedList.add(humanTest3);
        expectedList.add(humanTest5);

        assertEquals(expectedList, CollectionsDemo.getCopyOfHumanList(humanTestList, humanTest4));
    }

    @Test
    public void testGetUniqueSets() {
        HashSet<Integer> intTestSet1 = new HashSet<Integer>();
        intTestSet1.add(1);
        intTestSet1.add(2);
        intTestSet1.add(3);
        HashSet<Integer> intTestSet2 = new HashSet<Integer>();
        intTestSet2.add(4);
        intTestSet2.add(5);
        intTestSet2.add(6);
        HashSet<Integer> intTestSet3 = new HashSet<Integer>();
        intTestSet3.add(7);
        intTestSet3.add(8);
        intTestSet3.add(9);
        HashSet<Integer> intTestSet4 = new HashSet<Integer>();
        intTestSet4.add(0);
        intTestSet4.add(5);
        intTestSet4.add(10);

        ArrayList<HashSet<Integer>> intSetTestList = new ArrayList<HashSet<Integer>>();
        intSetTestList.add(intTestSet1);
        intSetTestList.add(intTestSet2);
        intSetTestList.add(intTestSet3);

        ArrayList<HashSet<Integer>> expectedTestList = new ArrayList<HashSet<Integer>>();
        expectedTestList.add(intTestSet1);
        expectedTestList.add(intTestSet3);

        assertEquals(expectedTestList, CollectionsDemo.getUniqueSets(intSetTestList, intTestSet4));
    }

    @Test
    public void testGetMaxAgeSet() {
        Human human1 = new Human("Name1", "Surname1", "Patronymic1", 16);
        Human human2 = new Human("Name2", "Surname2", "Patronymic2", 20);
        Human human3 = new Human("Name3", "Surname3", "Patronymic3", 18);
        Student student1 = new Student("Name4", "Surname4", "Patronymic4", 20, "FacultyName1");
        Student student2 = new Student("Name5", "Surname5", "Patronymic5", 19, "FacultyName2");
        ArrayList<Human> humanTestList = new ArrayList<Human>();
        humanTestList.add(human1);
        humanTestList.add(human2);
        humanTestList.add(human3);
        humanTestList.add(student1);
        humanTestList.add(student2);

        HashSet<Human> expectedMaxAgeSet = new HashSet<Human>();
        expectedMaxAgeSet.add(human2);
        expectedMaxAgeSet.add(student1);

        assertEquals(expectedMaxAgeSet, CollectionsDemo.getMaxAgeSet(humanTestList));
    }

    @Test
    public void testGetSetOfPeopleWhoseIDsAreContainedInTheInputSet() {
        Human human1 = new Human("Name1", "Surname1", "Patronymic1", 16);
        Human human2 = new Human("Name2", "Surname2", "Patronymic2", 20);
        Human human3 = new Human("Name3", "Surname3", "Patronymic3", 18);
        Student student1 = new Student("Name4", "Surname4", "Patronymic4", 20, "FacultyName1");
        Student student2 = new Student("Name5", "Surname5", "Patronymic5", 19, "FacultyName2");

        Map<Integer, Human> mapTestIdToHuman = new HashMap<Integer, Human>();
        mapTestIdToHuman.put(111, human1);
        mapTestIdToHuman.put(222, human2);
        mapTestIdToHuman.put(333, human3);
        mapTestIdToHuman.put(444, student1);
        mapTestIdToHuman.put(555, student2);

        HashSet<Integer> intTestSet = new HashSet<Integer>();
        intTestSet.add(111);
        intTestSet.add(333);
        intTestSet.add(555);

        HashSet<Human> expectedSet = new HashSet<Human>();
        expectedSet.add(human1);
        expectedSet.add(human3);
        expectedSet.add(student2);

        assertEquals(expectedSet, CollectionsDemo.getSetOfPeopleWhoseIDsAreContainedInTheInputSet(mapTestIdToHuman, intTestSet));
    }

    @Test
    public void testGetSetOfIDsOfPeopleWhoseAgeIsNotLessThan18YearsOld() {
        Human human1 = new Human("Name1", "Surname1", "Patronymic1", 16);
        Human human2 = new Human("Name2", "Surname2", "Patronymic2", 20);
        Human human3 = new Human("Name3", "Surname3", "Patronymic3", 17);
        Student student1 = new Student("Name4", "Surname4", "Patronymic4", 21, "FacultyName1");
        Student student2 = new Student("Name5", "Surname5", "Patronymic5", 18, "FacultyName2");

        Map<Integer, Human> mapTestIdToHuman = new HashMap<Integer, Human>();
        mapTestIdToHuman.put(111, human1);
        mapTestIdToHuman.put(222, human2);
        mapTestIdToHuman.put(333, human3);
        mapTestIdToHuman.put(444, student1);
        mapTestIdToHuman.put(555, student2);

        HashSet<Integer> expectedSet = new HashSet<Integer>();
        expectedSet.add(222);
        expectedSet.add(444);
        expectedSet.add(555);

        assertEquals(expectedSet, CollectionsDemo.getSetOfIDsOfPeopleWhoseAgeIsNotLessThan18YearsOld(mapTestIdToHuman));
    }

    @Test
    public void testGetMapIdToAge() {
        Human human1 = new Human("Name1", "Surname1", "Patronymic1", 16);
        Human human2 = new Human("Name2", "Surname2", "Patronymic2", 20);
        Human human3 = new Human("Name3", "Surname3", "Patronymic3", 17);
        Student student1 = new Student("Name4", "Surname4", "Patronymic4", 21, "FacultyName1");
        Student student2 = new Student("Name5", "Surname5", "Patronymic5", 19, "FacultyName2");

        Map<Integer, Human> mapTestIdToHuman = new HashMap<Integer, Human>();
        mapTestIdToHuman.put(111, human1);
        mapTestIdToHuman.put(222, human2);
        mapTestIdToHuman.put(333, human3);
        mapTestIdToHuman.put(444, student1);
        mapTestIdToHuman.put(555, student2);

        Map<Integer, Integer> expectedMap = new HashMap<Integer, Integer>();
        expectedMap.put(111, 16);
        expectedMap.put(222, 20);
        expectedMap.put(333, 17);
        expectedMap.put(444, 21);
        expectedMap.put(555, 19);

        assertEquals(expectedMap, CollectionsDemo.getMapIdToAge(mapTestIdToHuman));
    }

    @Test
    public void testGetMapAgeToHumanSet() {
        Human human1 = new Human("Name1", "Surname1", "Patronymic1", 11);
        Human human2 = new Human("Name2", "Surname2", "Patronymic2", 22);
        Human human3 = new Human("Name3", "Surname3", "Patronymic3", 33);
        Human human4 = new Human("Name4", "Surname4", "Patronymic4", 44);
        Human human5 = new Human("Name5", "Surname5", "Patronymic5", 55);
        Human human6 = new Human("Name6", "Surname6", "Patronymic6", 66);
        Student student1 = new Student("Name7", "Surname7", "Patronymic7", 11, "FacultyName1");
        Student student2 = new Student("Name8", "Surname8", "Patronymic8", 22, "FacultyName2");
        Student student3 = new Student("Name9", "Surname9", "Patronymic9", 33, "FacultyName3");
        Student student4 = new Student("Name10", "Surname10", "Patronymic10", 44, "FacultyName4");

        HashSet<Human> humanTestSet = new HashSet<Human>();
        humanTestSet.add(human1);
        humanTestSet.add(human2);
        humanTestSet.add(human3);
        humanTestSet.add(human4);
        humanTestSet.add(human5);
        humanTestSet.add(human6);
        humanTestSet.add(student1);
        humanTestSet.add(student2);
        humanTestSet.add(student3);
        humanTestSet.add(student4);

        HashSet<Human> expectedSet1 = new HashSet<Human>();
        expectedSet1.add(human1);
        expectedSet1.add(student1);
        HashSet<Human> expectedSet2 = new HashSet<Human>();
        expectedSet2.add(human2);
        expectedSet2.add(student2);
        HashSet<Human> expectedSet3 = new HashSet<Human>();
        expectedSet3.add(human3);
        expectedSet3.add(student3);
        HashSet<Human> expectedSet4 = new HashSet<Human>();
        expectedSet4.add(human4);
        expectedSet4.add(student4);
        HashSet<Human> expectedSet5 = new HashSet<Human>();
        expectedSet5.add(human5);
        HashSet<Human> expectedSet6 = new HashSet<Human>();
        expectedSet6.add(human6);

        Map<Integer, HashSet<Human>> expectedMap = new HashMap<Integer, HashSet<Human>>();
        expectedMap.put(11, expectedSet1);
        expectedMap.put(22, expectedSet2);
        expectedMap.put(33, expectedSet3);
        expectedMap.put(44, expectedSet4);
        expectedMap.put(55, expectedSet5);
        expectedMap.put(66, expectedSet6);

        assertEquals(expectedMap, CollectionsDemo.getMapAgeToHumanSet(humanTestSet));

    }
}