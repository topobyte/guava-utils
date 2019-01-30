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

import java.util.List;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class Filtering
{

	public static <T> List<T> filter(Iterable<?> input, Class<T> type)
	{
		return Lists.newArrayList(Iterables.filter(input, type));
	}

}
