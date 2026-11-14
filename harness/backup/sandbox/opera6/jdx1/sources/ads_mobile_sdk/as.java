package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class as extends ozb implements Function1 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ as(Intent intent, byte b) {
        super(1);
        this.i = b;
        this.a = intent;
    }

    public final Object invoke(Object obj) {
        byte b = this.i;
        Intent intent = this.a;
        switch (b) {
            case 0:
                return intent.setType((String) obj);
            case 1:
                return intent.setPackage((String) obj);
            case 2:
                String[] strArr = (String[]) new Regex("/").l(2, (String) obj).toArray(new String[0]);
                if (strArr.length == 2) {
                    intent.setComponent(new ComponentName(strArr[0], strArr[1]));
                }
                return Unit.a;
            case 3:
                return intent.setData(Uri.parse((String) obj));
            default:
                return intent.setAction((String) obj);
        }
    }
}
