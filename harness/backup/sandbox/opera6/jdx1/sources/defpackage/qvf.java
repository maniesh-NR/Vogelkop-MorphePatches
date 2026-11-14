package defpackage;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.TransactionTooLargeException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class qvf {
    public static final Intent a = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));

    public static List a(int i, Intent intent) {
        try {
            tgk tgkVarL = tgk.l();
            try {
                List<ResolveInfo> listQueryIntentActivities = t8.a.getPackageManager().queryIntentActivities(intent, i);
                tgkVarL.close();
                return listQueryIntentActivities;
            } finally {
            }
        } catch (RuntimeException e) {
            if (!(e instanceof NullPointerException) && !(e.getCause() instanceof TransactionTooLargeException)) {
                throw e;
            }
            intent.toString();
            return Collections.EMPTY_LIST;
        }
    }

    public static ResolveInfo b(int i, Intent intent) {
        try {
            tgk tgkVarM = tgk.m();
            try {
                ResolveInfo resolveInfoResolveActivity = t8.a.getPackageManager().resolveActivity(intent, i);
                tgkVarM.close();
                return resolveInfoResolveActivity;
            } finally {
            }
        } catch (RuntimeException e) {
            if (!(e instanceof NullPointerException) && !(e.getCause() instanceof TransactionTooLargeException)) {
                throw e;
            }
            intent.toString();
            return null;
        }
    }
}
