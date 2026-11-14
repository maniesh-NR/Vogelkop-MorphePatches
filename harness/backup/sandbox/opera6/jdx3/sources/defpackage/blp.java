package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class blp {
    public static final Set a = e82.E(new String[]{"com.android.browser", "com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.chrome.canary", "com.microsoft.emmx", "org.mozilla.firefox", "org.mozilla.firefox_beta", "org.mozilla.fennec_aurora", "com.sec.android.app.sbrowser", "com.huawei.browser", "com.honor.browser", "com.hihonor.baidu.browser", "com.heytap.browser", "com.coloros.browser", "com.vivo.browser", "com.miui.browser", "com.realme.browser", "com.oneplus.browser", "com.meizu.browser", "com.zte.browser", "cn.nubia.browser", "com.lge.browser", "com.asus.browser", "com.lenovo.browser", "com.transsion.browser", "com.transsion.phoenix", "com.opera.browser", "com.opera.browser.beta", "com.opera.mini.native", "com.opera.mini.native.beta", "com.brave.browser", "com.vivaldi.browser", "com.UCMobile", "com.UCMobile.intl", "com.uc.browser.en", "com.tencent.mtt", "com.qihoo.browser", "com.duckduckgo.mobile.android", "com.kiwibrowser.browser", "com.aloha.browser", "com.alohamobile.browser", "com.yandex.browser", "com.baidu.browser.apps", "sogou.mobile.explorer", "org.torproject.torbrowser", "mark.via.gp", "com.cloudmosa.puffinFree", "com.ksmobile.cb", "com.mx.browser", "acr.browser.lightning", "com.naver.whale"});
    public static final Set b = e82.E(new String[]{"com.alibaba.aliexpresshd", "com.alibaba.android.rimet", "com.alibaba.icbu.app.aliexpress.seller", "com.alibaba.icbu.app.seller", "com.alibaba.intl.android.apps.poseidon", "com.alibaba.wireless", "com.alicloud.databox", "com.aliyun.aliclouder", "com.aliyun.iotx.vehicle.app", "com.amazon.mShop.android.shopping", "com.autonavi.minimap", "com.baidu.BaiduMap", "com.baidu.searchbox", "com.cainiao.wireless", "com.dianping.v1", "com.ebay.mobile", "com.eg.android.AlipayGphone", "com.einnovation.temu", "com.facebook.katana", "com.google.android.youtube", "com.instagram.android", "com.jingdong.app.mall", "com.koubei.cashier", "com.lazada.android", "com.linkedin.android", "com.netease.cloudmusic", "com.sankuai.meituan", "com.shopee.ar", "com.shopee.br", "com.shopee.cl", "com.shopee.co", "com.shopee.id", "com.shopee.mx", "com.shopee.my", "com.shopee.pe", "com.shopee.ph", "com.shopee.sg", "com.shopee.th", "com.shopee.tw", "com.shopee.vn", "com.shuqi.controller", "com.sina.weibo", "com.smile.gifmaker", "com.ss.android.ugc.aweme", "com.ss.android.ugc.aweme.lite", "com.ss.android.ugc.aweme.mobile", "com.taobao.etao", "com.taobao.idlefish", "com.taobao.ju.android", "com.taobao.movie.android", "com.taobao.taobao", "com.taobao.travel", "com.tencent.mm", "com.tencent.mobileqq", "com.tmall.wireless", "com.tudou.android", "com.twitter.android", "com.ximalaya.ting.android", "com.xunmeng.pinduoduo", "com.yahoo.mobile.client.android.yahoo", "com.youku.phone", "com.zhiliaoapp.musically", "me.ele", "me.ele.crowdsource"});

    public static ComponentName a(ResolveInfo resolveInfo) {
        String str;
        String str2;
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        if (activityInfo == null || (str = activityInfo.packageName) == null || str.length() == 0 || (str2 = activityInfo.name) == null || str2.length() == 0) {
            return null;
        }
        return new ComponentName(activityInfo.packageName, activityInfo.name);
    }

    public static ArrayList b(Context context, boolean z) {
        PackageManager packageManager = context.getPackageManager();
        Intent intentAddCategory = new Intent("android.intent.action.VIEW").setData(Uri.fromParts(z ? "https" : "http", "", null)).addCategory("android.intent.category.BROWSABLE");
        List listA = n5p.a(packageManager, intentAddCategory, 131072);
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ComponentName componentNameA = a((ResolveInfo) it.next());
            if (componentNameA != null) {
                arrayList.add(componentNameA);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ResolveInfo resolveInfoD = n5p.d(packageManager, intentAddCategory);
        ComponentName componentNameA2 = resolveInfoD != null ? a(resolveInfoD) : null;
        if (componentNameA2 != null && arrayList2.contains(componentNameA2)) {
            arrayList2.remove(componentNameA2);
            arrayList2.add(0, componentNameA2);
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(android.content.Context r12, android.net.Uri r13) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blp.c(android.content.Context, android.net.Uri):boolean");
    }
}
