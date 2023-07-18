package com.example.uasanmp.model;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UbayaKulinerDatabase_Impl extends UbayaKulinerDatabase {
  private volatile UserDao _userDao;

  private volatile FoodDao _foodDao;

  private volatile OrderDao _orderDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `User` (`username` TEXT NOT NULL, `password` TEXT NOT NULL, `fullname` TEXT NOT NULL, `phonenumber` TEXT NOT NULL, `saldo` INTEGER NOT NULL DEFAULT 1000000, `iduser` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Food` (`nama` TEXT NOT NULL, `harga` INTEGER NOT NULL, `deskripsi` TEXT NOT NULL, `kategori` TEXT NOT NULL, `photourl` TEXT NOT NULL, `idfood` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Order` (`iduser` INTEGER NOT NULL, `idfood` INTEGER NOT NULL, `jumlah` INTEGER NOT NULL, `harga` INTEGER NOT NULL, `totalharga` INTEGER NOT NULL, `namapembeli` TEXT NOT NULL, `alamatkirim` TEXT NOT NULL, `tanggal` INTEGER NOT NULL, `nama` TEXT NOT NULL, `photourl` TEXT NOT NULL, `idorder` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'dd5cbb878bff1f4558db80b19bb70f33')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `User`");
        _db.execSQL("DROP TABLE IF EXISTS `Food`");
        _db.execSQL("DROP TABLE IF EXISTS `Order`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUser = new HashMap<String, TableInfo.Column>(6);
        _columnsUser.put("username", new TableInfo.Column("username", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("password", new TableInfo.Column("password", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("fullname", new TableInfo.Column("fullname", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("phonenumber", new TableInfo.Column("phonenumber", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("saldo", new TableInfo.Column("saldo", "INTEGER", true, 0, "1000000", TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("iduser", new TableInfo.Column("iduser", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUser = new TableInfo("User", _columnsUser, _foreignKeysUser, _indicesUser);
        final TableInfo _existingUser = TableInfo.read(_db, "User");
        if (! _infoUser.equals(_existingUser)) {
          return new RoomOpenHelper.ValidationResult(false, "User(com.example.uasanmp.model.User).\n"
                  + " Expected:\n" + _infoUser + "\n"
                  + " Found:\n" + _existingUser);
        }
        final HashMap<String, TableInfo.Column> _columnsFood = new HashMap<String, TableInfo.Column>(6);
        _columnsFood.put("nama", new TableInfo.Column("nama", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("harga", new TableInfo.Column("harga", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("deskripsi", new TableInfo.Column("deskripsi", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("kategori", new TableInfo.Column("kategori", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("photourl", new TableInfo.Column("photourl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("idfood", new TableInfo.Column("idfood", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFood = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFood = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFood = new TableInfo("Food", _columnsFood, _foreignKeysFood, _indicesFood);
        final TableInfo _existingFood = TableInfo.read(_db, "Food");
        if (! _infoFood.equals(_existingFood)) {
          return new RoomOpenHelper.ValidationResult(false, "Food(com.example.uasanmp.model.Food).\n"
                  + " Expected:\n" + _infoFood + "\n"
                  + " Found:\n" + _existingFood);
        }
        final HashMap<String, TableInfo.Column> _columnsOrder = new HashMap<String, TableInfo.Column>(11);
        _columnsOrder.put("iduser", new TableInfo.Column("iduser", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("idfood", new TableInfo.Column("idfood", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("jumlah", new TableInfo.Column("jumlah", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("harga", new TableInfo.Column("harga", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("totalharga", new TableInfo.Column("totalharga", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("namapembeli", new TableInfo.Column("namapembeli", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("alamatkirim", new TableInfo.Column("alamatkirim", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("tanggal", new TableInfo.Column("tanggal", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("nama", new TableInfo.Column("nama", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("photourl", new TableInfo.Column("photourl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("idorder", new TableInfo.Column("idorder", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOrder = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOrder = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOrder = new TableInfo("Order", _columnsOrder, _foreignKeysOrder, _indicesOrder);
        final TableInfo _existingOrder = TableInfo.read(_db, "Order");
        if (! _infoOrder.equals(_existingOrder)) {
          return new RoomOpenHelper.ValidationResult(false, "Order(com.example.uasanmp.model.Order).\n"
                  + " Expected:\n" + _infoOrder + "\n"
                  + " Found:\n" + _existingOrder);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "dd5cbb878bff1f4558db80b19bb70f33", "0aa7684b094a99aee263ca7f40879c84");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "User","Food","Order");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `User`");
      _db.execSQL("DELETE FROM `Food`");
      _db.execSQL("DELETE FROM `Order`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(UserDao.class, UserDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(FoodDao.class, FoodDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(OrderDao.class, OrderDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public FoodDao foodDao() {
    if (_foodDao != null) {
      return _foodDao;
    } else {
      synchronized(this) {
        if(_foodDao == null) {
          _foodDao = new FoodDao_Impl(this);
        }
        return _foodDao;
      }
    }
  }

  @Override
  public OrderDao orderDao() {
    if (_orderDao != null) {
      return _orderDao;
    } else {
      synchronized(this) {
        if(_orderDao == null) {
          _orderDao = new OrderDao_Impl(this);
        }
        return _orderDao;
      }
    }
  }
}
