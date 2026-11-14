package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class yjb {
    public static final f30 a = new f30((byte) 14);

    static {
        Pattern.compile("\\.\\d+(Z|[+\\-][0-9]{2}(?::?[0-9]{2})?)$");
    }

    public static Date a(String str) {
        return ((SimpleDateFormat) a.get()).parse(str);
    }
}
