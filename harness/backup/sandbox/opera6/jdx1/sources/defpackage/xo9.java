package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xo9 extends SQLiteOpenHelper {
    public static final /* synthetic */ int h = 0;
    public final Context a;
    public final eq6 b;
    public final e04 c;
    public final boolean d;
    public boolean e;
    public final k1h f;
    public boolean g;

    public xo9(Context context, String str, final eq6 eq6Var, final e04 e04Var, boolean z) {
        super(context, str, null, e04Var.b, new DatabaseErrorHandler(e04Var, eq6Var) { // from class: uo9
            public final /* synthetic */ eq6 a;

            {
                this.a = eq6Var;
            }

            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = xo9.h;
                eq6 eq6Var2 = this.a;
                to9 to9Var = (to9) eq6Var2.a;
                if (to9Var == null || !Intrinsics.a(to9Var.a, sQLiteDatabase)) {
                    to9Var = new to9(sQLiteDatabase);
                    eq6Var2.a = to9Var;
                }
                SQLiteDatabase sQLiteDatabase2 = to9Var.a;
                Objects.toString(to9Var);
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        e04.b(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        to9Var.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                } finally {
                    if (attachedDbs != null) {
                        Iterator<T> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            e04.b((String) ((Pair) it.next()).second);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            e04.b(path2);
                        }
                    }
                }
            }
        });
        this.a = context;
        this.b = eq6Var;
        this.c = e04Var;
        this.d = z;
        this.f = new k1h(context.getCacheDir(), str == null ? UUID.randomUUID().toString() : str, false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() throws IOException {
        k1h k1hVar = this.f;
        try {
            k1hVar.a(k1hVar.a);
            super.close();
            this.b.a = null;
            this.g = false;
        } finally {
            k1hVar.b();
        }
    }

    public final to9 h(boolean z) throws IOException {
        to9 to9VarK;
        k1h k1hVar = this.f;
        try {
            k1hVar.a((this.g || getDatabaseName() == null) ? false : true);
            this.e = false;
            SQLiteDatabase sQLiteDatabaseL = l(z);
            if (this.e) {
                close();
                to9VarK = h(z);
            } else {
                to9VarK = k(sQLiteDatabaseL);
            }
            return to9VarK;
        } finally {
            k1hVar.b();
        }
    }

    public final to9 k(SQLiteDatabase sQLiteDatabase) {
        eq6 eq6Var = this.b;
        to9 to9Var = (to9) eq6Var.a;
        if (to9Var != null && Intrinsics.a(to9Var.a, sQLiteDatabase)) {
            return to9Var;
        }
        to9 to9Var2 = new to9(sQLiteDatabase);
        eq6Var.a = to9Var2;
        return to9Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.sqlite.SQLiteDatabase] */
    public final SQLiteDatabase l(boolean z) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.g;
        Context context = this.a;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        try {
            return z ? getWritableDatabase() : getReadableDatabase();
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                this = z ? getWritableDatabase() : getReadableDatabase();
                return this;
            } catch (Throwable th) {
                th = th;
                if (th instanceof vo9) {
                    vo9 vo9Var = (vo9) th;
                    int iOrdinal = vo9Var.a.ordinal();
                    th = vo9Var.b;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        h9o.p();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return z ? this.getWritableDatabase() : this.getReadableDatabase();
                } catch (vo9 e) {
                    throw e.b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        boolean z = this.e;
        e04 e04Var = this.c;
        if (!z && e04Var.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            k(sQLiteDatabase);
            e04Var.getClass();
        } catch (Throwable th) {
            throw new vo9(wo9.a, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.c.e(k(sQLiteDatabase));
        } catch (Throwable th) {
            throw new vo9(wo9.b, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.e = true;
        try {
            this.c.f(k(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new vo9(wo9.d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.e) {
            try {
                this.c.g(k(sQLiteDatabase));
            } catch (Throwable th) {
                throw new vo9(wo9.e, th);
            }
        }
        this.g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.e = true;
        try {
            this.c.h(k(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new vo9(wo9.c, th);
        }
    }
}
