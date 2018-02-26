package org.wecancodeit.pairselector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class PairSelector {

	private Random rng; // needs to be constructed
	
	private List<Person> people;
	
	public PairSelector(Random rng, Person... people) {
		this.rng = rng;
		this.people = new ArrayList<>(Arrays.asList(people));
	}

	Collection<Pair> generate() {
		
		Collection<Pair> pairs = new ArrayList<>();
		
		Person first = selectPerson();
		
		Person second = selectPerson();
		
		pairs.add(new Pair(first, second));
		
		return pairs;
	}

	private Person selectPerson() {
		Person selected = people.get(rng.nextInt(people.size()));
		people.remove(selected);
		return selected;
	}

}
