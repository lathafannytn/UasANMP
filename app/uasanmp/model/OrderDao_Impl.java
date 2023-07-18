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
public final class OrderDao_Impl implements OrderDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Order> __insertionAdapterOfOrder;

  private final EntityDeletionOrUpdateAdapter<Order> __deletionAdapterOfOrder;

  private final SharedSQLiteStatement __preparedStmtOfUpdateOrder;

  public OrderDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOrder = new EntityInsertionAdapter<Order>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Order` (`iduser`,`idfood`,`jumlah`,`harga`,`totalharga`,`namapembeli`,`alamatkirim`,`tanggal`,`nama`,`photourl`,`idorder`) VALUES (?,?,?,?,?,?,?,?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Order value) {
        stmt.bindLong(1, value.getIduser());
        stmt.bindLong(2, value.getIdfood());
        stmt.bindLong(3, value.getJumlah());
        stmt.bindLong(4, value.getHarga());
        stmt.bindLong(5, value.getTotalharga());
        if (value.getNamapembeli() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getNamapembeli());
        }
        if (value.getAlamatkirim() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getAlamatkirim());
        }
        stmt.bindLong(8, value.getTanggal());
        if (value.getNama() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getNama());
        }
        if (value.getPhotourl() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getPhotourl());
        }
        stmt.bindLong(11, value.getIdorder());
      }
    };
    this.__deletionAdapterOfOrder = new EntityDeletionOrUpdateAdapter<Order>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Order` WHERE `idorder` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Order value) {
        stmt.bindLong(1, value.getIdorder());
      }
    };
    this.__preparedStmtOfUpdateOrder = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE `order` SET iduser=?,idfood=?,namapembeli=?,alamatkirim=?,tanggal=?,harga=?,jumlah=?,totalharga=? WHERE idorder=?";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final Order... order) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfOrder.insert(order);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteOrder(final Order order) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfOrder.handle(order);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateOrder(final int iduser, final int idfood, final String namapembeli,
      final String alamatkirim, final int tanggal, final int jumlah, final int harga,
      final int totalHarga, final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateOrder.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, iduser);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, idfood);
    _argIndex = 3;
    if (namapembeli == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, namapembeli);
    }
    _argIndex = 4;
    if (alamatkirim == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, alamatkirim);
    }
    _argIndex = 5;
    _stmt.bindLong(_argIndex, tanggal);
    _argIndex = 6;
    _stmt.bindLong(_argIndex, harga);
    _argIndex = 7;
    _stmt.bindLong(_argIndex, jumlah);
    _argIndex = 8;
    _stmt.bindLong(_argIndex, totalHarga);
    _argIndex = 9;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateOrder.release(_stmt);
    }
  }

  @Override
  public List<Order> selectAllOrder() {
    final String _sql = "SELECT * FROM `order`";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfIduser = CursorUtil.getColumnIndexOrThrow(_cursor, "iduser");
      final int _cursorIndexOfIdfood = CursorUtil.getColumnIndexOrThrow(_cursor, "idfood");
      final int _cursorIndexOfJumlah = CursorUtil.getColumnIndexOrThrow(_cursor, "jumlah");
      final int _cursorIndexOfHarga = CursorUtil.getColumnIndexOrThrow(_cursor, "harga");
      final int _cursorIndexOfTotalharga = CursorUtil.getColumnIndexOrThrow(_cursor, "totalharga");
      final int _cursorIndexOfNamapembeli = CursorUtil.getColumnIndexOrThrow(_cursor, "namapembeli");
      final int _cursorIndexOfAlamatkirim = CursorUtil.getColumnIndexOrThrow(_cursor, "alamatkirim");
      final int _cursorIndexOfTanggal = CursorUtil.getColumnIndexOrThrow(_cursor, "tanggal");
      final int _cursorIndexOfNama = CursorUtil.getColumnIndexOrThrow(_cursor, "nama");
      final int _cursorIndexOfPhotourl = CursorUtil.getColumnIndexOrThrow(_cursor, "photourl");
      final int _cursorIndexOfIdorder = CursorUtil.getColumnIndexOrThrow(_cursor, "idorder");
      final List<Order> _result = new ArrayList<Order>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Order _item;
        final int _tmpIduser;
        _tmpIduser = _cursor.getInt(_cursorIndexOfIduser);
        final int _tmpIdfood;
        _tmpIdfood = _cursor.getInt(_cursorIndexOfIdfood);
        final int _tmpJumlah;
        _tmpJumlah = _cursor.getInt(_cursorIndexOfJumlah);
        final int _tmpHarga;
        _tmpHarga = _cursor.getInt(_cursorIndexOfHarga);
        final int _tmpTotalharga;
        _tmpTotalharga = _cursor.getInt(_cursorIndexOfTotalharga);
        final String _tmpNamapembeli;
        if (_cursor.isNull(_cursorIndexOfNamapembeli)) {
          _tmpNamapembeli = null;
        } else {
          _tmpNamapembeli = _cursor.getString(_cursorIndexOfNamapembeli);
        }
        final String _tmpAlamatkirim;
        if (_cursor.isNull(_cursorIndexOfAlamatkirim)) {
          _tmpAlamatkirim = null;
        } else {
          _tmpAlamatkirim = _cursor.getString(_cursorIndexOfAlamatkirim);
        }
        final int _tmpTanggal;
        _tmpTanggal = _cursor.getInt(_cursorIndexOfTanggal);
        final String _tmpNama;
        if (_cursor.isNull(_cursorIndexOfNama)) {
          _tmpNama = null;
        } else {
          _tmpNama = _cursor.getString(_cursorIndexOfNama);
        }
        final String _tmpPhotourl;
        if (_cursor.isNull(_cursorIndexOfPhotourl)) {
          _tmpPhotourl = null;
        } else {
          _tmpPhotourl = _cursor.getString(_cursorIndexOfPhotourl);
        }
        _item = new Order(_tmpIduser,_tmpIdfood,_tmpJumlah,_tmpHarga,_tmpTotalharga,_tmpNamapembeli,_tmpAlamatkirim,_tmpTanggal,_tmpNama,_tmpPhotourl);
        final int _tmpIdorder;
        _tmpIdorder = _cursor.getInt(_cursorIndexOfIdorder);
        _item.setIdorder(_tmpIdorder);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Order selectOrder(final int id) {
    final String _sql = "SELECT * FROM `order` where idorder =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfIduser = CursorUtil.getColumnIndexOrThrow(_cursor, "iduser");
      final int _cursorIndexOfIdfood = CursorUtil.getColumnIndexOrThrow(_cursor, "idfood");
      final int _cursorIndexOfJumlah = CursorUtil.getColumnIndexOrThrow(_cursor, "jumlah");
      final int _cursorIndexOfHarga = CursorUtil.getColumnIndexOrThrow(_cursor, "harga");
      final int _cursorIndexOfTotalharga = CursorUtil.getColumnIndexOrThrow(_cursor, "totalharga");
      final int _cursorIndexOfNamapembeli = CursorUtil.getColumnIndexOrThrow(_cursor, "namapembeli");
      final int _cursorIndexOfAlamatkirim = CursorUtil.getColumnIndexOrThrow(_cursor, "alamatkirim");
      final int _cursorIndexOfTanggal = CursorUtil.getColumnIndexOrThrow(_cursor, "tanggal");
      final int _cursorIndexOfNama = CursorUtil.getColumnIndexOrThrow(_cursor, "nama");
      final int _cursorIndexOfPhotourl = CursorUtil.getColumnIndexOrThrow(_cursor, "photourl");
      final int _cursorIndexOfIdorder = CursorUtil.getColumnIndexOrThrow(_cursor, "idorder");
      final Order _result;
      if(_cursor.moveToFirst()) {
        final int _tmpIduser;
        _tmpIduser = _cursor.getInt(_cursorIndexOfIduser);
        final int _tmpIdfood;
        _tmpIdfood = _cursor.getInt(_cursorIndexOfIdfood);
        final int _tmpJumlah;
        _tmpJumlah = _cursor.getInt(_cursorIndexOfJumlah);
        final int _tmpHarga;
        _tmpHarga = _cursor.getInt(_cursorIndexOfHarga);
        final int _tmpTotalharga;
        _tmpTotalharga = _cursor.getInt(_cursorIndexOfTotalharga);
        final String _tmpNamapembeli;
        if (_cursor.isNull(_cursorIndexOfNamapembeli)) {
          _tmpNamapembeli = null;
        } else {
          _tmpNamapembeli = _cursor.getString(_cursorIndexOfNamapembeli);
        }
        final String _tmpAlamatkirim;
        if (_cursor.isNull(_cursorIndexOfAlamatkirim)) {
          _tmpAlamatkirim = null;
        } else {
          _tmpAlamatkirim = _cursor.getString(_cursorIndexOfAlamatkirim);
        }
        final int _tmpTanggal;
        _tmpTanggal = _cursor.getInt(_cursorIndexOfTanggal);
        final String _tmpNama;
        if (_cursor.isNull(_cursorIndexOfNama)) {
          _tmpNama = null;
        } else {
          _tmpNama = _cursor.getString(_cursorIndexOfNama);
        }
        final String _tmpPhotourl;
        if (_cursor.isNull(_cursorIndexOfPhotourl)) {
          _tmpPhotourl = null;
        } else {
          _tmpPhotourl = _cursor.getString(_cursorIndexOfPhotourl);
        }
        _result = new Order(_tmpIduser,_tmpIdfood,_tmpJumlah,_tmpHarga,_tmpTotalharga,_tmpNamapembeli,_tmpAlamatkirim,_tmpTanggal,_tmpNama,_tmpPhotourl);
        final int _tmpIdorder;
        _tmpIdorder = _cursor.getInt(_cursorIndexOfIdorder);
        _result.setIdorder(_tmpIdorder);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Order> selectUserOrder(final int iduser) {
    final String _sql = "SELECT * FROM `order` where iduser =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, iduser);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfIduser = CursorUtil.getColumnIndexOrThrow(_cursor, "iduser");
      final int _cursorIndexOfIdfood = CursorUtil.getColumnIndexOrThrow(_cursor, "idfood");
      final int _cursorIndexOfJumlah = CursorUtil.getColumnIndexOrThrow(_cursor, "jumlah");
      final int _cursorIndexOfHarga = CursorUtil.getColumnIndexOrThrow(_cursor, "harga");
      final int _cursorIndexOfTotalharga = CursorUtil.getColumnIndexOrThrow(_cursor, "totalharga");
      final int _cursorIndexOfNamapembeli = CursorUtil.getColumnIndexOrThrow(_cursor, "namapembeli");
      final int _cursorIndexOfAlamatkirim = CursorUtil.getColumnIndexOrThrow(_cursor, "alamatkirim");
      final int _cursorIndexOfTanggal = CursorUtil.getColumnIndexOrThrow(_cursor, "tanggal");
      final int _cursorIndexOfNama = CursorUtil.getColumnIndexOrThrow(_cursor, "nama");
      final int _cursorIndexOfPhotourl = CursorUtil.getColumnIndexOrThrow(_cursor, "photourl");
      final int _cursorIndexOfIdorder = CursorUtil.getColumnIndexOrThrow(_cursor, "idorder");
      final List<Order> _result = new ArrayList<Order>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Order _item;
        final int _tmpIduser;
        _tmpIduser = _cursor.getInt(_cursorIndexOfIduser);
        final int _tmpIdfood;
        _tmpIdfood = _cursor.getInt(_cursorIndexOfIdfood);
        final int _tmpJumlah;
        _tmpJumlah = _cursor.getInt(_cursorIndexOfJumlah);
        final int _tmpHarga;
        _tmpHarga = _cursor.getInt(_cursorIndexOfHarga);
        final int _tmpTotalharga;
        _tmpTotalharga = _cursor.getInt(_cursorIndexOfTotalharga);
        final String _tmpNamapembeli;
        if (_cursor.isNull(_cursorIndexOfNamapembeli)) {
          _tmpNamapembeli = null;
        } else {
          _tmpNamapembeli = _cursor.getString(_cursorIndexOfNamapembeli);
        }
        final String _tmpAlamatkirim;
        if (_cursor.isNull(_cursorIndexOfAlamatkirim)) {
          _tmpAlamatkirim = null;
        } else {
          _tmpAlamatkirim = _cursor.getString(_cursorIndexOfAlamatkirim);
        }
        final int _tmpTanggal;
        _tmpTanggal = _cursor.getInt(_cursorIndexOfTanggal);
        final String _tmpNama;
        if (_cursor.isNull(_cursorIndexOfNama)) {
          _tmpNama = null;
        } else {
          _tmpNama = _cursor.getString(_cursorIndexOfNama);
        }
        final String _tmpPhotourl;
        if (_cursor.isNull(_cursorIndexOfPhotourl)) {
          _tmpPhotourl = null;
        } else {
          _tmpPhotourl = _cursor.getString(_cursorIndexOfPhotourl);
        }
        _item = new Order(_tmpIduser,_tmpIdfood,_tmpJumlah,_tmpHarga,_tmpTotalharga,_tmpNamapembeli,_tmpAlamatkirim,_tmpTanggal,_tmpNama,_tmpPhotourl);
        final int _tmpIdorder;
        _tmpIdorder = _cursor.getInt(_cursorIndexOfIdorder);
        _item.setIdorder(_tmpIdorder);
        _result.add(_item);
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
