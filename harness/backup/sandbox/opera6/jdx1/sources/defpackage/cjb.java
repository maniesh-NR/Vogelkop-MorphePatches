package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public class cjb extends IOException {
    public boolean a;

    public static cjb d() {
        return new cjb("Protocol message had invalid UTF-8.");
    }

    public static zib g() {
        return new zib("Protocol message tag had invalid wire type.");
    }

    public static cjb h() {
        return new cjb("CodedInputStream encountered a malformed varint.");
    }

    public static cjb i() {
        return new cjb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static cjb j() {
        return new cjb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
