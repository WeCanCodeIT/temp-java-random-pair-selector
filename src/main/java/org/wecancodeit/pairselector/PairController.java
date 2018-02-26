package org.wecancodeit.pairselector;

import java.util.Collection;

import org.springframework.ui.Model;

public class PairController {
	
	private PairSelector selector;

	public void selectPairs(Model model) {
		Collection<Pair> pairs = selector.generate();
		model.addAttribute("generatedPairs", pairs);
	}

}
