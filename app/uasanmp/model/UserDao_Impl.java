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
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<User> __insertionAdapterOfUser;

  private final EntityDeletionOrUpdateAdapter<User> __deletionAdapterOfUser;

  private final SharedSQLiteStatement __preparedStmtOfUserUpdate;

  private final SharedSQLiteStatement __preparedStmtOfUpdateSaldo;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `User` (`username`,`password`,`fullname`,`phonenumber`,`saldo`,`iduser`) VALUES (?,?,?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        if (value.getUsername() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUsername());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPassword());
        }
        if (value.getFullname() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFullname());
        }
        if (value.getPhonenumber() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPhonenumber());
        }
        stmt.bindLong(5, value.getSaldo());
        stmt.bindLong(6, value.getIduser());
      }
    };
    this.__deletionAdapterOfUser = new EntityDeletionOrUpdateAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `User` WHERE `iduser` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getIduser());
      }
    };
    this.__preparedStmtOfUserUpdate = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE user SET fullname =?, phonenumber =?, password =? WHERE iduser=?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateSaldo = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE user SET saldo =? WHERE iduser=?";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final User... user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUser.insert(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteUser(final User user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfUser.handle(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void userUpdate(final String fullname, final String phonenumber, final String password,
      final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUserUpdate.acquire();
    int _argIndex = 1;
    if (fullname == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, fullname);
    }
    _argIndex = 2;
    if (phonenumber == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, phonenumber);
    }
    _argIndex = 3;
    if (password == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, password);
    }
    _argIndex = 4;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUserUpdate.release(_stmt);
    }
  }

  @Override
  public void updateSaldo(final int saldo, final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateSaldo.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, saldo);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateSaldo.release(_stmt);
    }
  }

  @Override
  public List<User> selectAllUser() {
    final String _sql = "SELECT * FROM user";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
      final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
      final int _cursorIndexOfFullname = CursorUtil.getColumnIndexOrThrow(_cursor, "fullname");
      final int _cursorIndexOfPhonenumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phonenumber");
      final int _cursorIndexOfSaldo = CursorUtil.getColumnIndexOrThrow(_cursor, "saldo");
      final int _cursorIndexOfIduser = CursorUtil.getColumnIndexOrThrow(_cursor, "iduser");
      final List<User> _result = new ArrayList<User>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final User _item;
        final String _tmpUsername;
        if (_cursor.isNull(_cursorIndexOfUsername)) {
          _tmpUsername = null;
        } else {
          _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        }
        final String _tmpPassword;
        if (_cursor.isNull(_cursorIndexOfPassword)) {
          _tmpPassword = null;
        } else {
          _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
        }
        final String _tmpFullname;
        if (_cursor.isNull(_cursorIndexOfFullname)) {
          _tmpFullname = null;
        } else {
          _tmpFullname = _cursor.getString(_cursorIndexOfFullname);
        }
        final String _tmpPhonenumber;
        if (_cursor.isNull(_cursorIndexOfPhonenumber)) {
          _tmpPhonenumber = null;
        } else {
          _tmpPhonenumber = _cursor.getString(_cursorIndexOfPhonenumber);
        }
        final int _tmpSaldo;
        _tmpSaldo = _cursor.getInt(_cursorIndexOfSaldo);
        _item = new User(_tmpUsername,_tmpPassword,_tmpFullname,_tmpPhonenumber,_tmpSaldo);
        final int _tmpIduser;
        _tmpIduser = _cursor.getInt(_cursorIndexOfIduser);
        _item.setIduser(_tmpIduser);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public User selectUser(final String username, final String password) {
    final String _sql = "SELECT * FROM user WHERE username= ? AND password=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (username == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, username);
    }
    _argIndex = 2;
    if (password == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, password);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
      final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
      final int _cursorIndexOfFullname = CursorUtil.getColumnIndexOrThrow(_cursor, "fullname");
      final int _cursorIndexOfPhonenumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phonenumber");
      final int _cursorIndexOfSaldo = CursorUtil.getColumnIndexOrThrow(_cursor, "saldo");
      final int _cursorIndexOfIduser = CursorUtil.getColumnIndexOrThrow(_cursor, "iduser");
      final User _result;
      if(_cursor.moveToFirst()) {
        final String _tmpUsername;
        if (_cursor.isNull(_cursorIndexOfUsername)) {
          _tmpUsername = null;
        } else {
          _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        }
        final String _tmpPassword;
        if (_cursor.isNull(_cursorIndexOfPassword)) {
          _tmpPassword = null;
        } else {
          _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
        }
        final String _tmpFullname;
        if (_cursor.isNull(_cursorIndexOfFullname)) {
          _tmpFullname = null;
        } else {
          _tmpFullname = _cursor.getString(_cursorIndexOfFullname);
        }
        final String _tmpPhonenumber;
        if (_cursor.isNull(_cursorIndexOfPhonenumber)) {
          _tmpPhonenumber = null;
        } else {
          _tmpPhonenumber = _cursor.getString(_cursorIndexOfPhonenumber);
        }
        final int _tmpSaldo;
        _tmpSaldo = _cursor.getInt(_cursorIndexOfSaldo);
        _result = new User(_tmpUsername,_tmpPassword,_tmpFullname,_tmpPhonenumber,_tmpSaldo);
        final int _tmpIduser;
        _tmpIduser = _cursor.getInt(_cursorIndexOfIduser);
        _result.setIduser(_tmpIduser);
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
  public User selectProfile(final String username) {
    final String _sql = "SELECT * FROM user WHERE username= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (username == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, username);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
      final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
      final int _cursorIndexOfFullname = CursorUtil.getColumnIndexOrThrow(_cursor, "fullname");
      final int _cursorIndexOfPhonenumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phonenumber");
      final int _cursorIndexOfSaldo = CursorUtil.getColumnIndexOrThrow(_cursor, "saldo");
      final int _cursorIndexOfIduser = CursorUtil.getColumnIndexOrThrow(_cursor, "iduser");
      final User _result;
      if(_cursor.moveToFirst()) {
        final String _tmpUsername;
        if (_cursor.isNull(_cursorIndexOfUsername)) {
          _tmpUsername = null;
        } else {
          _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        }
        final String _tmpPassword;
        if (_cursor.isNull(_cursorIndexOfPassword)) {
          _tmpPassword = null;
        } else {
          _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
        }
        final String _tmpFullname;
        if (_cursor.isNull(_cursorIndexOfFullname)) {
          _tmpFullname = null;
        } else {
          _tmpFullname = _cursor.getString(_cursorIndexOfFullname);
        }
        final String _tmpPhonenumber;
        if (_cursor.isNull(_cursorIndexOfPhonenumber)) {
          _tmpPhonenumber = null;
        } else {
          _tmpPhonenumber = _cursor.getString(_cursorIndexOfPhonenumber);
        }
        final int _tmpSaldo;
        _tmpSaldo = _cursor.getInt(_cursorIndexOfSaldo);
        _result = new User(_tmpUsername,_tmpPassword,_tmpFullname,_tmpPhonenumber,_tmpSaldo);
        final int _tmpIduser;
        _tmpIduser = _cursor.getInt(_cursorIndexOfIduser);
        _result.setIduser(_tmpIduser);
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
