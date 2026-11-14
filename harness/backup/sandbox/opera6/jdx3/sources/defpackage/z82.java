package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaMetadata;
import android.net.Uri;

/* loaded from: classes.dex */
public final /* synthetic */ class z82 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Comparable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z82(byte b, Object obj, Object obj2, String str) {
        this.a = b;
        this.b = obj;
        this.c = str;
        this.d = obj2;
    }

    public /* synthetic */ z82(wu5 wu5Var, Context context, Uri uri, MediaMetadata.Builder builder) {
        this.a = (byte) 1;
        this.b = context;
        this.c = uri;
        this.d = builder;
    }

    public final Object get() throws Throwable {
        String str;
        long j;
        byte b = this.a;
        Object obj = this.d;
        Comparable comparable = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                f92 f92Var = (f92) obj2;
                String str2 = (String) comparable;
                au8 au8Var = (au8) obj;
                if (f92Var.a == null) {
                    str = "";
                    j = 3600000;
                } else {
                    str = "NewsFeed";
                    j = 600000;
                }
                long j2 = j;
                return new hv2(str, j2, str2, au8Var.d, f92Var.d(), new ip1(f92Var, (byte) 3));
            case 1:
                MediaMetadata.Builder builder = (MediaMetadata.Builder) obj;
                wu5.d((Context) obj2, (Uri) comparable, builder);
                return builder.build();
            default:
                String str3 = (String) obj;
                jlh jlhVar = ((glh) obj2).a;
                Long lK = jlhVar.k((String) comparable);
                if (lK != null) {
                    long jLongValue = lK.longValue();
                    SQLiteDatabase writableDatabase = jlhVar.getWritableDatabase();
                    writableDatabase.beginTransaction();
                    try {
                        String[] strArr = {Long.toString(jLongValue)};
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("image_path", str3);
                        writableDatabase.update("reading", contentValues, "id=?", strArr);
                        writableDatabase.setTransactionSuccessful();
                    } finally {
                        writableDatabase.endTransaction();
                    }
                }
                return lK;
        }
    }
}
