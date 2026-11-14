package org.chromium.net;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface EchMode {
    public static final int DISABLED = 0;
    public static final int OPPORTUNISTIC = 1;
    public static final int STRICT = 2;
}
