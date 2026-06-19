package com.pekar.angelblock.clientaccess;

import com.pekar.angelblock.network.ClientToServerPacket;

public interface INetworkClientAccessor
{
    void sendToServer(ClientToServerPacket packet);
}
