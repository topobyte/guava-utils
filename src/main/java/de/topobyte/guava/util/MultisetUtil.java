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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.Multiset;
import com.google.common.collect.Multiset.Entry;

public class MultisetUtil
{

	public static <T extends Comparable<T>> List<Entry<T>> entries(
			Multiset<T> multiset, Order countOrder, Order elementOrder)
	{
		List<Entry<T>> lines = new ArrayList<>();
		lines.addAll(multiset.entrySet());
		Collections.sort(lines,
				new MultisetEntryComparator<T>(countOrder, elementOrder));
		return lines;
	}

}
