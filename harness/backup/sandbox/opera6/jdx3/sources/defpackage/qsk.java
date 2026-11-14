package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public interface qsk extends Closeable {
    String getDatabaseName();

    to9 getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
