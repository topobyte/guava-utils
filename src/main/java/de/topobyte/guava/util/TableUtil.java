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

import com.google.common.collect.ArrayTable;
import com.google.common.collect.Table;

public class TableUtil
{

	public static <R, C, V> ArrayTable<R, C, V> arrayTable(Table<R, C, V> table,
			List<C> headers, List<R> rows)
	{
		ArrayTable<R, C, V> result = ArrayTable.create(rows, headers);
		for (R row : rows) {
			for (C col : headers) {
				result.put(row, col, table.get(row, col));
			}
		}
		return result;
	}

}
