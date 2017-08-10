package cn.nukkit.network.protocol;

public class PlayerSkinPacket extends DataPacket {
    
    public long entityUniqueId;
    public String skinId;
    public String skinName;
    public String serializeName;
    public String skinData;
    public String capeData;
    public String geometryModel;
    public String geometryData;

    @Override
    public byte pid() {
        return ProtocolInfo.PLAYER_SKIN_PACKET;
    }

    @Override
    public void decode() {
        this.entityUniqueId = this.getLong();
	this.skinId = this.getString();
	this.skinName = this.getString();
	this.serializeName = this.getString();
	this.skinData = this.getString();
	this.capeData = this.getString();
	this.geometryModel = this.getString();
	this.geometryData = this.getString();
    }

    @Override
    public void encode() {
        this.reset();
        this.putVarLong(this.entityUniqueId);
	this.putString(this.skinId);
	this.putString(this.skinName);
	this.putString(this.serializeName);
	this.putString(this.skinData);
	this.putString(this.capeData);
	this.putString(this.geometryModel);
	this.putString(this.geometryData);
    }
            
}
