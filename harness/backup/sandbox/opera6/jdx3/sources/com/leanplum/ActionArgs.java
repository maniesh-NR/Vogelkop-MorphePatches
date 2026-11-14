package com.leanplum;

import com.leanplum.internal.ActionArg;
import com.leanplum.internal.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ActionArgs {
    private List<ActionArg<?>> args = new ArrayList();

    public boolean containsFile() {
        Iterator<ActionArg<?>> it = this.args.iterator();
        while (it.hasNext()) {
            if ("file".equals(it.next().kind())) {
                return true;
            }
        }
        return false;
    }

    public List<ActionArg<?>> getValue() {
        return this.args;
    }

    public <T> ActionArgs with(String str, T t) {
        if (str == null) {
            Log.e("with - Invalid name parameter provided.", new Object[0]);
            return this;
        }
        this.args.add(ActionArg.argNamed(str, t));
        return this;
    }

    public ActionArgs withAction(String str, String str2) {
        if (str == null) {
            Log.e("withAction - Invalid name parameter provided.", new Object[0]);
            return this;
        }
        this.args.add(ActionArg.actionArgNamed(str, str2));
        return this;
    }

    public ActionArgs withAsset(String str, String str2) {
        if (str == null) {
            Log.e("withAsset - Invalid name parameter provided.", new Object[0]);
            return this;
        }
        this.args.add(ActionArg.assetArgNamed(str, str2));
        return this;
    }

    public ActionArgs withColor(String str, int i) {
        if (str == null) {
            Log.e("withColor - Invalid name parameter provided.", new Object[0]);
            return this;
        }
        this.args.add(ActionArg.colorArgNamed(str, i));
        return this;
    }

    public ActionArgs withFile(String str, String str2) {
        if (str == null) {
            Log.e("withFile - Invalid name parameter provided.", new Object[0]);
            return this;
        }
        this.args.add(ActionArg.fileArgNamed(str, str2));
        return this;
    }
}
