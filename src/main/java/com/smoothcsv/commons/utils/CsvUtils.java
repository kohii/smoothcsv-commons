/*
 * Copyright 2016 kohii
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
package com.smoothcsv.commons.utils;

import com.smoothcsv.csv.reader.DefaultCsvReader;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

/**
 * @author kohii
 */
public class CsvUtils {

  private static ReusableCsvReader csvReader;

  private CsvUtils() {}

  public static List<String> parseSingleRow(String s) throws IOException {
    if (csvReader == null) {
      csvReader = new ReusableCsvReader();
    }
    csvReader.setupReader(new StringReader(s));
    List<String> list = csvReader.readRow();
    csvReader.close();
    return list;
  }

  public static List<List<String>> parse(String s) throws IOException {
    if (csvReader == null) {
      csvReader = new ReusableCsvReader();
    }
    csvReader.setupReader(new StringReader(s));
    List<List<String>> list = csvReader.readAll();
    csvReader.close();
    return list;
  }

  public static List<List<String>> parse(Reader reader) throws IOException {
    if (csvReader == null) {
      csvReader = new ReusableCsvReader();
    }
    csvReader.setupReader(reader);
    List<List<String>> list = csvReader.readAll();
    csvReader.close();
    return list;
  }

  private static class ReusableCsvReader extends DefaultCsvReader {

    public ReusableCsvReader() {
      super(null);
    }

    @Override
    public void setupReader(Reader in) {
      super.setupReader(in);
    }
  }
}
