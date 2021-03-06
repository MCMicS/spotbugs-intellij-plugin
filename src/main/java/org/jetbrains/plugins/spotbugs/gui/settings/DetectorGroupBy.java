/*
 * Copyright 2020 SpotBugs plugin contributors
 *
 * This file is part of IntelliJ SpotBugs plugin.
 *
 * IntelliJ SpotBugs plugin is free software: you can redistribute it 
 * and/or modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation, either version 3 of 
 * the License, or (at your option) any later version.
 *
 * IntelliJ SpotBugs plugin is distributed in the hope that it will
 * be useful, but WITHOUT ANY WARRANTY; without even the implied 
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with IntelliJ SpotBugs plugin.
 * If not, see <http://www.gnu.org/licenses/>.
 */
package org.jetbrains.plugins.spotbugs.gui.settings;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.PropertyKey;
import org.jetbrains.plugins.spotbugs.resources.ResourcesLoader;

enum DetectorGroupBy {
	Provider("detector.groupBy.provider"),
	Speed("detector.groupBy.speed"),
	BugCategory("detector.groupBy.bugCategory");

	@NotNull
	final String displayName;

	DetectorGroupBy(@NotNull @PropertyKey(resourceBundle = ResourcesLoader.BUNDLE) final String propertyKey) {
		displayName = ResourcesLoader.getString(propertyKey);
	}
}
