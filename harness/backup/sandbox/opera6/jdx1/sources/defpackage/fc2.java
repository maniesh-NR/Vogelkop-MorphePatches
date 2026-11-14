package defpackage;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class fc2 implements v7e {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public fc2(Resources resources, v7e v7eVar) {
        this.a = (byte) 2;
        this.c = resources;
        this.b = v7eVar;
    }

    public /* synthetic */ fc2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.v7e
    public final u7e a(Object obj, int i, int i2, trf trfVar) {
        u7e u7eVarA;
        Uri uri;
        byte b = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new u7e(new o6f(uri2), ((ec2) obj3).G((AssetManager) obj2, uri2.toString().substring(22)));
            case 1:
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                hub hubVar = null;
                for (int i3 = 0; i3 < size; i3++) {
                    v7e v7eVar = (v7e) arrayList.get(i3);
                    if (v7eVar.b(obj) && (u7eVarA = v7eVar.a(obj, i, i2, trfVar)) != null) {
                        hubVar = u7eVarA.a;
                        arrayList2.add(u7eVarA.c);
                    }
                }
                if (arrayList2.isEmpty() || hubVar == null) {
                    return null;
                }
                return new u7e(hubVar, new vbe(arrayList2, (ua7) obj3));
            default:
                Integer num = (Integer) obj;
                Resources resources = (Resources) obj3;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num.intValue()) + '/' + resources.getResourceTypeName(num.intValue()) + '/' + resources.getResourceEntryName(num.intValue()));
                } catch (Resources.NotFoundException unused) {
                    uri = null;
                }
                if (uri != null) {
                    return ((v7e) obj2).a(uri, i, i2, trfVar);
                }
                return null;
        }
    }

    @Override // defpackage.v7e
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                if ("file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0))) {
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((v7e) obj2).b(obj)) {
                        break;
                    }
                }
                break;
            default:
                break;
        }
        return true;
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.b).toArray()) + '}';
            default:
                return super.toString();
        }
    }
}
