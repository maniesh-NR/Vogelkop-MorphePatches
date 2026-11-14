package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1mSDK implements AFi1lSDK {

    @NotNull
    private PluginInfo getCurrencyIso4217Code = new PluginInfo(Plugin.NATIVE, "6.17.0", null, 4, null);

    @Override // com.appsflyer.internal.AFi1lSDK
    public final void AFAdRevenueData(@NotNull PluginInfo pluginInfo) {
        this.getCurrencyIso4217Code = pluginInfo;
    }

    @Override // com.appsflyer.internal.AFi1lSDK
    @NotNull
    public final Map<String, Object> getMediationNetwork() {
        LinkedHashMap linkedHashMapD = rbd.d(new Pair[]{new Pair("platform", this.getCurrencyIso4217Code.getPlugin().getPluginName()), new Pair("version", this.getCurrencyIso4217Code.getVersion())});
        if (!this.getCurrencyIso4217Code.getAdditionalParams().isEmpty()) {
            linkedHashMapD.put("extras", this.getCurrencyIso4217Code.getAdditionalParams());
        }
        return linkedHashMapD;
    }
}
