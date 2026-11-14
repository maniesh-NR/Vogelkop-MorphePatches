package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class bgc {
    public static final Pattern a = Pattern.compile("(?:(?:https?|ftp|market):\\/\\/|www\\.|ftp\\.)[^\\s\")]+|(?:(?:mailto|sms|smsto|tel|geo|data):[^\\s\")]+)|(?:[a-zA-Z0-9.]+\\.com(?:[^\\s\")]+)?)", 2);
}
