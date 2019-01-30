// Copyright 2019 Sebastian Kuerten
//
// This file is part of guava-utils.
//
// guava-utils is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// guava-utils is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with guava-utils. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.guava.util;

import java.util.Comparator;

import com.google.common.collect.Multiset.Entry;

public class MultisetEntryComparator<T extends Comparable<T>>
		implements Comparator<Entry<T>>
{

	private Order countOrder;
	private Order elementOrder;

	public MultisetEntryComparator(Order countOrder, Order elementOrder)
	{
		this.countOrder = countOrder;
		this.elementOrder = elementOrder;
	}

	@Override
	public int compare(Entry<T> o1, Entry<T> o2)
	{
		int cmpOrder = Integer.compare(o1.getCount(), o2.getCount());
		if (cmpOrder != 0) {
			return countOrder == Order.DESCENDING ? -cmpOrder : cmpOrder;
		}
		int cmpElement = o1.getElement().compareTo(o2.getElement());
		if (cmpElement != 0) {
			return elementOrder == Order.DESCENDING ? -cmpElement : cmpElement;
		}
		return 0;
	}

}
