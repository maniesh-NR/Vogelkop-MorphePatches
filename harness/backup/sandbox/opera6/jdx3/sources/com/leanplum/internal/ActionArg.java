package com.leanplum.internal;

import android.text.TextUtils;
import com.leanplum.internal.Constants;
import defpackage.fc;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ActionArg<T> {
    private T defaultValue;
    private boolean isAsset;
    private String kind;
    private String name;

    private ActionArg() {
    }

    public static ActionArg<String> actionArgNamed(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return argNamed(str, str2, "action");
    }

    public static <T> ActionArg<T> argNamed(String str, T t) {
        return argNamed(str, t, VarCache.kindFromValue(t));
    }

    private static <T> ActionArg<T> argNamed(String str, T t, String str2) {
        ActionArg<T> actionArg = new ActionArg<>();
        ((ActionArg) actionArg).name = str;
        ((ActionArg) actionArg).kind = str2;
        ((ActionArg) actionArg).defaultValue = t;
        return actionArg;
    }

    public static ActionArg<String> assetArgNamed(String str, String str2) throws Throwable {
        ActionArg<String> actionArgArgNamed = argNamed(str, str2, "file");
        ((ActionArg) actionArgArgNamed).isAsset = true;
        String str3 = ((ActionArg) actionArgArgNamed).defaultValue;
        VarCache.registerFile(str3, str3, new fc(actionArgArgNamed, (byte) 0));
        return actionArgArgNamed;
    }

    public static ActionArg<Integer> colorArgNamed(String str, int i) {
        return argNamed(str, Integer.valueOf(i), Constants.Kinds.COLOR);
    }

    public static ActionArg<String> fileArgNamed(String str, String str2) throws Throwable {
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        ActionArg<String> actionArgArgNamed = argNamed(str, str2, "file");
        String str3 = ((ActionArg) actionArgArgNamed).defaultValue;
        VarCache.registerFile(str3, str3, new fc(actionArgArgNamed, (byte) 0));
        return actionArgArgNamed;
    }

    public InputStream defaultStream() {
        if (!this.kind.equals("file")) {
            return null;
        }
        Boolean boolValueOf = Boolean.valueOf(this.isAsset);
        Boolean boolValueOf2 = Boolean.valueOf(this.isAsset);
        T t = this.defaultValue;
        return FileManager.stream(false, boolValueOf, boolValueOf2, (String) t, (String) t, null);
    }

    public T defaultValue() {
        return this.defaultValue;
    }

    public String kind() {
        return this.kind;
    }

    public String name() {
        return this.name;
    }
}
