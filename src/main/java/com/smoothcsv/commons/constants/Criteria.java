/*
 * Copyright 2015 kohii
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.smoothcsv.commons.constants;

import com.smoothcsv.commons.utils.EnumStringSupport;

/**
 * 
 * @author kohii
 */
public enum Criteria {

  EQUALS, DOES_NOT_EQUAL, STARTS_WITH, DOES_NOT_START_WITH, ENDS_WITH, DOES_NOT_END_WITH, CONTAINS, DOES_NOT_CONTAIN, IS_GREATER_THAN, IS_LESS_THAN, EQUALS_OR_IS_GREATER_THAN, EQUALS_OR_IS_LESS_THAN, IS_IN, IS_NOT_IN, IS_BLANK, IS_NOT_BLANK, IS_INTEGER, IS_NOT_INTEGER, EXISTS, DOES_NOT_EXISTS;

  @Override
  public String toString() {
    return EnumStringSupport.getString(this);
  }
}
