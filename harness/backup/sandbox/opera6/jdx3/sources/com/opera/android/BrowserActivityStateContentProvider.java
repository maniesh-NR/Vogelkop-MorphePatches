package com.opera.android;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.leanplum.internal.Constants;
import defpackage.fge;

/* loaded from: classes.dex */
public class BrowserActivityStateContentProvider extends ContentProvider {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String path = uri.getPath();
        int i = 0;
        i = 0;
        i = 0;
        i = 0;
        i = 0;
        i = 0;
        if (path != null && !path.isEmpty() && path.charAt(0) == '/') {
            String strSubstring = path.substring(1);
            if ("foreground".equals(strSubstring)) {
                Context context = getContext();
                String[] strArr3 = OperaApplication.K;
                i = ((OperaApplication) context.getApplicationContext()).o;
            } else if ("flow_foreground".equals(strSubstring)) {
                Context context2 = getContext();
                String[] strArr4 = OperaApplication.K;
                if (((OperaApplication) context2.getApplicationContext()).o && fge.S) {
                    i = 1;
                }
            }
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{Constants.Params.VALUE});
        matrixCursor.newRow().add(Integer.valueOf(i));
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
