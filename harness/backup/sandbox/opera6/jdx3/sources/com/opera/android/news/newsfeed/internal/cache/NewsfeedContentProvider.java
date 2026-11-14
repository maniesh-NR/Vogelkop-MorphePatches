package com.opera.android.news.newsfeed.internal.cache;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import defpackage.are;
import defpackage.jlh;
import defpackage.sko;
import defpackage.yt7;

/* loaded from: classes.dex */
public class NewsfeedContentProvider extends ContentProvider {
    public UriMatcher a;
    public jlh b;

    public static String a(Context context) {
        return context.getPackageName() + ".newsfeed";
    }

    public static Uri b(Context context) {
        return Uri.parse("content://" + a(context) + "/");
    }

    public static String d(int i) {
        if (i == 100) {
            return "articles";
        }
        if (i == 200) {
            return "categories";
        }
        if (i == 300) {
            return "images";
        }
        if (i == 600) {
            return "feedback_reasons";
        }
        if (i == 1100) {
            return "cities";
        }
        if (i == 1200) {
            return "city_registrations";
        }
        yt7.k(sko.i(i, "Unknown id: "));
        return null;
    }

    @Override // android.content.ContentProvider
    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        int iC = c(uri);
        SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            int i = 0;
            for (ContentValues contentValues : contentValuesArr) {
                if (writableDatabase.insert(d(iC), null, contentValues) != -1) {
                    i++;
                }
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            getContext().getContentResolver().notifyChange(uri, null);
            return i;
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public final int c(Uri uri) {
        int iMatch = this.a.match(uri);
        if (iMatch == 100 || iMatch == 200 || iMatch == 300 || iMatch == 600 || iMatch == 1100 || iMatch == 1200) {
            return iMatch;
        }
        yt7.k(fki.p(uri, "Unknown uri: "));
        return 0;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        int iC = c(uri);
        if (str == null) {
            str = "1";
        }
        int iDelete = this.b.getWritableDatabase().delete(d(iC), str, strArr);
        if (iDelete != 0) {
            getContext().getContentResolver().notifyChange(uri, null);
        }
        return iDelete;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        int iMatch = this.a.match(uri);
        if (iMatch == 100) {
            return "vnd.android.cursor.dir/" + a(getContext()) + "/newsfeed";
        }
        if (iMatch == 200) {
            return "vnd.android.cursor.dir/" + a(getContext()) + "/categories";
        }
        if (iMatch == 300) {
            return "vnd.android.cursor.dir/" + a(getContext()) + "/newsfeedimgs";
        }
        if (iMatch == 600) {
            return "vnd.android.cursor.dir/" + a(getContext()) + "/feedback_reasons";
        }
        if (iMatch == 1100) {
            return "vnd.android.cursor.dir/" + a(getContext()) + "/cities";
        }
        if (iMatch != 1200) {
            yt7.k(fki.p(uri, "Unknown uri: "));
            return null;
        }
        return "vnd.android.cursor.dir/" + a(getContext()) + "/city_registrations";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        Uri uriWithAppendedId;
        int iC = c(uri);
        long jInsert = this.b.getWritableDatabase().insert(d(iC), null, contentValues);
        if (jInsert <= 0) {
            throw new SQLException(fki.p(uri, "Failed to insert row into "));
        }
        if (iC == 100) {
            uriWithAppendedId = ContentUris.withAppendedId(are.d(getContext()), jInsert);
        } else if (iC == 200) {
            uriWithAppendedId = ContentUris.withAppendedId(are.e(getContext()), jInsert);
        } else if (iC == 300) {
            uriWithAppendedId = ContentUris.withAppendedId(are.c(getContext()), jInsert);
        } else if (iC == 600) {
            uriWithAppendedId = ContentUris.withAppendedId(are.f(getContext()), jInsert);
        } else if (iC == 1100) {
            uriWithAppendedId = ContentUris.withAppendedId(are.a(getContext()), jInsert);
        } else {
            if (iC != 1200) {
                yt7.k(sko.i(iC, "Unknown id: "));
                return null;
            }
            uriWithAppendedId = ContentUris.withAppendedId(are.b(getContext()), jInsert);
        }
        getContext().getContentResolver().notifyChange(uri, null);
        return uriWithAppendedId;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        this.b = new jlh(getContext(), "newsfeed.db", null, 42, (byte) 1);
        Context context = getContext();
        UriMatcher uriMatcher = new UriMatcher(-1);
        String strA = a(context);
        uriMatcher.addURI(strA, "newsfeed", 100);
        uriMatcher.addURI(strA, "categories", 200);
        uriMatcher.addURI(strA, "newsfeedimgs", MessageTemplateConstants.Values.CENTER_POPUP_WIDTH);
        uriMatcher.addURI(strA, "feedback_reasons", 600);
        uriMatcher.addURI(strA, "cities", 1100);
        uriMatcher.addURI(strA, "city_registrations", 1200);
        this.a = uriMatcher;
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursorQuery = this.b.getReadableDatabase().query(d(c(uri)), strArr, str, strArr2, null, null, str2);
        cursorQuery.setNotificationUri(getContext().getContentResolver(), uri);
        return cursorQuery;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int iC = c(uri);
        if (str == null) {
            str = "1";
        }
        int iUpdate = this.b.getWritableDatabase().update(d(iC), contentValues, str, strArr);
        if (iUpdate != 0) {
            getContext().getContentResolver().notifyChange(uri, null);
        }
        return iUpdate;
    }
}
