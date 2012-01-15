/**
 * Copyright 2010 Allegheny College.
 *
 * This file is part of XInteract.
 *
 * XInteract is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License V3 as published
 * by the Free Software Foundation.
 *
 * XInteract is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with XInteract.  If not, see <http://www.gnu.org/licenses/>.
 */
package cayenne.DBobjects;

import cayenne.DBobjects.auto._Attempt;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class Attempt extends _Attempt implements Comparable<cayenne.DBobjects.Attempt> {

    @Override
    public String toString() {
        return getDate().toString() + "    " +
                getStudent().toString() + "    " +
                getProblem().toString();
    }

    public int compareTo(Attempt someAttempt) {
        int i = getProblem().compareTo(someAttempt.getProblem());
        if (i == 0) {
            return getDate().compareTo(someAttempt.getDate());
        } else {
            return i;
        }

    }
}



