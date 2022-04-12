/*
 * Copyright (c) 2018 - 2019 YCSB contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You
 * may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License. See accompanying
 * LICENSE file.
 */

package site.ycsb.db.freefaasstore;

import site.ycsb.*;
import site.ycsb.Status;
import net.jcip.annotations.GuardedBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import java.io.*;
//import java.nio.ByteBuffer;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;

//import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * RocksDB binding for <a href="http://rocksdb.org/">RocksDB</a>.
 * <p>
 * See {@code rocksdb/README.md} for details.
 */
public class FreeFaaSStoreClient extends DB {

  static final String PROPERTY_ROCKSDB_DIR = "freefaasstore.dir";
  static final String PROPERTY_ROCKSDB_OPTIONS_FILE = "freefaasstore.optionsfile";
  private static final String COLUMN_FAMILY_NAMES_FILENAME = "CF_NAMES";

  private static final Logger LOGGER = LoggerFactory.getLogger(FreeFaaSStoreClient.class);

  @GuardedBy("FreeFaaSStoreClient.class")
  private static Path rocksDbDir = null;
  @GuardedBy("FreeFaaSStoreClient.class")
  private static Path optionsFile = null;
  //  @GuardedBy("FreeFaaSStoreClient.class") private static RocksObject dbOptions = null;
//  @GuardedBy("FreeFaaSStoreClient.class") private static RocksDB rocksDb = null;
  @GuardedBy("FreeFaaSStoreClient.class")
  private static int references = 0;

  private static final ConcurrentMap<String, Lock> COLUMN_FAMILY_LOCKS = new ConcurrentHashMap<>();

  @Override
  public void init() throws DBException {
//    synchronized(FreeFaaSStoreClient.class) {
//      if(rocksDb == null) {
//        rocksDbDir = Paths.get(getProperties().getProperty(PROPERTY_ROCKSDB_DIR));
//        LOGGER.info("RocksDB data dir: " + rocksDbDir);
//
//        String optionsFileString = getProperties().getProperty(PROPERTY_ROCKSDB_OPTIONS_FILE);
//        if (optionsFileString != null) {
//          optionsFile = Paths.get(optionsFileString);
//          LOGGER.info("RocksDB options file: " + optionsFile);
//        }
//
//        try {
//          if (optionsFile != null) {
//            rocksDb = initRocksDBWithOptionsFile();
//          } else {
//            rocksDb = initRocksDB();
//          }
//        } catch (final IOException | RocksDBException e) {
//          throw new DBException(e);
//        }
//      }
//
//      references++;
//    }
  }

  @Override
  public void cleanup() throws DBException {

  }

  @Override
  public Status read(final String table, final String key, final Set<String> fields,
                     final Map<String, ByteIterator> result) {
    return null;

  }

  @Override
  public Status scan(final String table, final String startkey, final int recordcount, final Set<String> fields,
                     final Vector<HashMap<String, ByteIterator>> result) {
    return null;

  }

  @Override
  public Status update(final String table, final String key, final Map<String, ByteIterator> values) {
    return null;

  }

  @Override
  public Status insert(final String table, final String key, final Map<String, ByteIterator> values) {
    return null;

  }

  @Override
  public Status delete(final String table, final String key) {

    return null;
  }
}
