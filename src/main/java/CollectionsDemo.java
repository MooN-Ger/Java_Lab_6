import java.util.*;

public class CollectionsDemo {
    public static int getCountStringsStartsWithChar(ArrayList<String> strList, char ch) {
        int count = 0;
        for (String str : strList) {
            if (str.startsWith(String.valueOf(ch))) {
                count++;
            }
        }
        return count;
    }

    public static ArrayList<Human> getListOfSameSurname(ArrayList<Human> humanList, Human human) {
        ArrayList<Human> sameSurnameList = new ArrayList<Human>();
        for (Human someHuman : humanList) {
            if (someHuman.getSurname().equals(human.getSurname())) {
                sameSurnameList.add(someHuman);
            }
        }
        return sameSurnameList;
    }

    public static ArrayList<Human> getCopyOfHumanList(ArrayList<Human> humanArrayList, Human human) {
        ArrayList<Human> copyHumanArrayList = new ArrayList<Human>(humanArrayList);
        copyHumanArrayList.remove(human);

        return copyHumanArrayList;
    }

    public static ArrayList<HashSet<Integer>> getUniqueSets(ArrayList<HashSet<Integer>> intSetList, HashSet<Integer> intSet) {
        ArrayList<HashSet<Integer>> uniqueSetsList = new ArrayList<HashSet<Integer>>();

        for (HashSet<Integer> value : intSetList) {
            HashSet<Integer> intersection = new HashSet<Integer>(value);
            intersection.removeAll(intSet);
            if (intersection.equals(value)) {
                uniqueSetsList.add(value);
            }
        }
        return uniqueSetsList;
    }

    public static <T extends Human> HashSet<T> getMaxAgeSet(ArrayList<T> humanList) {
        HashSet<T> maxAgeSet = new HashSet<T>();
        int maxAge = 0;

        for(T human : humanList) {
            if (human.getAge() > maxAge) {
                maxAge = human.getAge();
                maxAgeSet.clear();
            }
            if (human.getAge() == maxAge) {
                maxAgeSet.add(human);
            }
        }
        return maxAgeSet;
    }

    public static <T extends Human> HashSet<T> getSetOfPeopleWhoseIDsAreContainedInTheInputSet(Map<Integer, T> mapIdToHuman, HashSet<Integer> intSet) {

        HashSet<T> SetOfPeopleWhoseIDsAreContainedInTheInputSet = new HashSet<T>();

        Set<Integer> keys = mapIdToHuman.keySet();
        keys.retainAll(intSet);

        for(Integer item : keys) {
            SetOfPeopleWhoseIDsAreContainedInTheInputSet.add(mapIdToHuman.get(item));
        }
        return SetOfPeopleWhoseIDsAreContainedInTheInputSet;
    }

    public static <T extends Human> HashSet<Integer> getSetOfIDsOfPeopleWhoseAgeIsNotLessThan18YearsOld(Map<Integer, T> mapIdToHuman) {

        HashSet<Integer> setOfIDsOfPeopleWhoseAgeIsNotLessThan18YearsOld = new HashSet<Integer>();

        Set<Integer> keys = mapIdToHuman.keySet();

        for(Integer item : keys) {
            if(mapIdToHuman.get(item).getAge() >= 18) {
                setOfIDsOfPeopleWhoseAgeIsNotLessThan18YearsOld.add(item);
            }
        }
        return setOfIDsOfPeopleWhoseAgeIsNotLessThan18YearsOld;
    }

    public static <T extends Human> Map<Integer, Integer> getMapIdToAge(Map<Integer, T> mapIdToHuman) {

        Map<Integer, Integer> mapIdToAge = new HashMap<Integer, Integer>();

        Set<Integer> keys = mapIdToHuman.keySet();

        for(Integer item : keys) {
            mapIdToAge.put(item, mapIdToHuman.get(item).getAge());
        }
        return mapIdToAge;
    }

    public static <T extends Human> Map<Integer, HashSet<T>> getMapAgeToHumanSet(HashSet<T> humanSet) {

        Map<Integer, HashSet<T>> mapAgeToHumanSet = new HashMap<Integer, HashSet<T>>();
        HashSet<Integer> ageSet = new HashSet<Integer>();


        for(T human : humanSet) {
            ageSet.add(human.getAge());
        }

        for(Integer age : ageSet) {
            HashSet<T> humanMapSet = new HashSet<T>();
            for(T human : humanSet) {
                if(age == human.getAge()) {
                    humanMapSet.add(human);
                }
            }
            mapAgeToHumanSet.put(age, humanMapSet);

        }
        return mapAgeToHumanSet;
    }
}
