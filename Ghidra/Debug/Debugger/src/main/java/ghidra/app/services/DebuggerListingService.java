/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ghidra.app.services;

import ghidra.app.plugin.core.debug.gui.action.LocationTrackingSpec;
import ghidra.app.plugin.core.debug.gui.listing.*;
import ghidra.framework.plugintool.ServiceInfo;
import ghidra.program.model.address.Address;
import ghidra.program.util.ProgramSelection;

@ServiceInfo( //
		defaultProvider = DebuggerListingPlugin.class, //
		description = "Replacement CodeViewerService for Debugger" //
)
public interface DebuggerListingService extends CodeViewerService {
	@Deprecated
	DebuggerListingProvider createListingIfMissing(LocationTrackingSpec spec,
			boolean followsCurrentThread);

	void setTrackingSpec(LocationTrackingSpec spec);

	void setCurrentSelection(ProgramSelection selection);

	boolean goTo(Address address, boolean centerOnScreen);
}
