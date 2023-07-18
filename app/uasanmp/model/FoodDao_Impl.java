package com.example.uasanmp.model;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FoodDao_Impl implements FoodDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Food> __insertionAdapterOfFood;

  private final EntityDeletionOrUpdateAdapter<Food> __deletionAdapterOfFood;

  private final SharedSQLiteStatement __preparedStmtOfFoodUpdate;

  public FoodDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFood = new EntityInsertionAdapter<Food>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Food` (`nama`,`harga`,`deskripsi`,`kategori`,`photourl`,`idfood`) VALUES (?,?,?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Food value) {
        if (value.getNama() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getNama());
        }
        stmt.bindLong(2, value.getHarga());
        if (value.getDeskripsi() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDeskripsi());
        }
        if (value.getKategori() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getKategori());
        }
        if (value.getPhotourl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPhotourl());
        }
        stmt.bindLong(6, value.getIdfood());
      }
    };
    this.__deletionAdapterOfFood = new EntityDeletionOrUpdateAdapter<Food>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Food` WHERE `idfood` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Food value) {
        stmt.bindLong(1, value.getIdfood());
      }
    };
    this.__preparedStmtOfFoodUpdate = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE food SET nama =?, deskripsi =?, harga =?, kategori = ? WHERE idfood=?";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final Food... food) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFood.insert(food);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteFood(final Food food) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfFood.handle(food);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void foodUpdate(final String nama, final String deskripsi, final int harga,
      final String kategori, final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfFoodUpdate.acquire();
    int _argIndex = 1;
    if (nama == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, nama);
    }
    _argIndex = 2;
    if (deskripsi == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, deskripsi);
    }
    _argIndex = 3;
    _stmt.bindLong(_argIndex, harga);
    _argIndex = 4;
    if (kategori == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, kategori);
    }
    _argIndex = 5;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfFoodUpdate.release(_stmt);
    }
  }

  @Override
  public List<Food> selectAllFood() {
    final String _sql = "SELECT * FROM food";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfNama = CursorUtil.getColumnIndexOrThrow(_cursor, "nama");
      final int _cursorIndexOfHarga = CursorUtil.getColumnIndexOrThrow(_cursor, "harga");
      final int _cursorIndexOfDeskripsi = CursorUtil.getColumnIndexOrThrow(_cursor, "deskripsi");
      final int _cursorIndexOfKategori = CursorUtil.getColumnIndexOrThrow(_cursor, "kategori");
      final int _cursorIndexOfPhotourl = CursorUtil.getColumnIndexOrThrow(_cursor, "photourl");
      final int _cursorIndexOfIdfood = CursorUtil.getColumnIndexOrThrow(_cursor, "idfood");
      final List<Food> _result = new ArrayList<Food>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Food _item;
        final String _tmpNama;
        if (_cursor.isNull(_cursorIndexOfNama)) {
          _tmpNama = null;
        } else {
          _tmpNama = _cursor.getString(_cursorIndexOfNama);
        }
        final int _tmpHarga;
        _tmpHarga = _cursor.getInt(_cursorIndexOfHarga);
        final String _tmpDeskripsi;
        if (_cursor.isNull(_cursorIndexOfDeskripsi)) {
          _tmpDeskripsi = null;
        } else {
          _tmpDeskripsi = _cursor.getString(_cursorIndexOfDeskripsi);
        }
        final String _tmpKategori;
        if (_cursor.isNull(_cursorIndexOfKategori)) {
          _tmpKategori = null;
        } else {
          _tmpKategori = _cursor.getString(_cursorIndexOfKategori);
        }
        final String _tmpPhotourl;
        if (_cursor.isNull(_cursorIndexOfPhotourl)) {
          _tmpPhotourl = null;
        } else {
          _tmpPhotourl = _cursor.getString(_cursorIndexOfPhotourl);
        }
        _item = new Food(_tmpNama,_tmpHarga,_tmpDeskripsi,_tmpKategori,_tmpPhotourl);
        final int _tmpIdfood;
        _tmpIdfood = _cursor.getInt(_cursorIndexOfIdfood);
        _item.setIdfood(_tmpIdfood);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Food selectFood(final int id) {
    final String _sql = "SELECT * FROM food WHERE idfood= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfNama = CursorUtil.getColumnIndexOrThrow(_cursor, "nama");
      final int _cursorIndexOfHarga = CursorUtil.getColumnIndexOrThrow(_cursor, "harga");
      final int _cursorIndexOfDeskripsi = CursorUtil.getColumnIndexOrThrow(_cursor, "deskripsi");
      final int _cursorIndexOfKategori = CursorUtil.getColumnIndexOrThrow(_cursor, "kategori");
      final int _cursorIndexOfPhotourl = CursorUtil.getColumnIndexOrThrow(_cursor, "photourl");
      final int _cursorIndexOfIdfood = CursorUtil.getColumnIndexOrThrow(_cursor, "idfood");
      final Food _result;
      if(_cursor.moveToFirst()) {
        final String _tmpNama;
        if (_cursor.isNull(_cursorIndexOfNama)) {
          _tmpNama = null;
        } else {
          _tmpNama = _cursor.getString(_cursorIndexOfNama);
        }
        final int _tmpHarga;
        _tmpHarga = _cursor.getInt(_cursorIndexOfHarga);
        final String _tmpDeskripsi;
        if (_cursor.isNull(_cursorIndexOfDeskripsi)) {
          _tmpDeskripsi = null;
        } else {
          _tmpDeskripsi = _cursor.getString(_cursorIndexOfDeskripsi);
        }
        final String _tmpKategori;
        if (_cursor.isNull(_cursorIndexOfKategori)) {
          _tmpKategori = null;
        } else {
          _tmpKategori = _cursor.getString(_cursorIndexOfKategori);
        }
        final String _tmpPhotourl;
        if (_cursor.isNull(_cursorIndexOfPhotourl)) {
          _tmpPhotourl = null;
        } else {
          _tmpPhotourl = _cursor.getString(_cursorIndexOfPhotourl);
        }
        _result = new Food(_tmpNama,_tmpHarga,_tmpDeskripsi,_tmpKategori,_tmpPhotourl);
        final int _tmpIdfood;
        _tmpIdfood = _cursor.getInt(_cursorIndexOfIdfood);
        _result.setIdfood(_tmpIdfood);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
