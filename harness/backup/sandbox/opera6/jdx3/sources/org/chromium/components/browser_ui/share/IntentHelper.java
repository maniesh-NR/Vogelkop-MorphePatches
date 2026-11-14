package org.chromium.components.browser_ui.share;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes.dex */
public abstract class IntentHelper {
    public static void sendEmail(String str, String str2, String str3, String str4, String str5) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        }
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.putExtra("android.intent.extra.TEXT", Html.fromHtml(str3));
        if (!TextUtils.isEmpty(str5)) {
            Uri uriX = w7d.x(new File(str5));
            intent.putExtra("android.intent.extra.STREAM", uriX);
            intent.addFlags(1);
            intent.setClipData(ClipData.newRawUri("", uriX));
        }
        try {
            Intent intentCreateChooser = Intent.createChooser(intent, str4);
            intentCreateChooser.addFlags(268435456);
            t8.a.startActivity(intentCreateChooser);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
