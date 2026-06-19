package com.pekar.angelblock.clientaccess;

public final class ClientAccessor
{
    private static INetworkClientAccessor networkClientAccessor;

    public static void init(
            INetworkClientAccessor networkAccessor
    )
    {
        networkClientAccessor = networkAccessor;
    }

    public static INetworkClientAccessor networkAccessor()
    {
        return networkClientAccessor;
    }
}
