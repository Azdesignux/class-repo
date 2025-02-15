/*!
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2002-2017 Hitachi Vantara..  All rights reserved.
 */

package org.pentaho.reporting.engine.classic.core.layout.build;

import org.pentaho.reporting.engine.classic.core.layout.model.RenderBox;
import org.pentaho.reporting.engine.classic.core.states.ReportStateKey;

public interface LayoutModelBuilderContext {
  RenderBox getRenderBox();

  void addChild( RenderBox child );

  void removeChild( RenderBox child );

  LayoutModelBuilderContext getParent();

  boolean isEmpty();

  void setEmpty( boolean empty );

  boolean isKeepWrapperBoxAlive();

  void setKeepWrapperBoxAlive( boolean keepWrapperBoxAlive );

  boolean isAutoGeneratedWrapperBox();

  void setAutoGeneratedWrapperBox( boolean autoGeneratedWrapperBox );

  LayoutModelBuilderContext close();

  LayoutModelBuilderContext deriveForPagebreak();

  LayoutModelBuilderContext deriveForStorage( RenderBox clonedRoot );

  boolean mergeSection( final ReportStateKey stateKey );

  public void validateAfterCommit();

  public void performParanoidModelCheck();

  public void restoreStateAfterRollback();

  public void commitAsEmpty();

  public int getDepth();
}
