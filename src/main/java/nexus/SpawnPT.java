
package nexus;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.potion.Effect;
/*
 * 이름 : MCJINWOO
 * 소속 : *Nexus*
 * 
 * 무단 수정 및 도용은 금지합니다.
 * 상업적 이익을 얻는용도로 사용을 금지합니다.
 * 배포시에는 저작자 MCJINWOO를 꼭 밝혀주세요.
 * 
 * 컴파일 alt+shift+X
 * 제작일 : 2017.08
 */
public class SpawnPT extends PluginBase{
	public void onEnable(){
		this.getLogger().info("서버 스폰 포션 플러그인  (야간투시.ver)");
	}
	
	public void onLoad() {
		this.getLogger().info("무단수정 및 도용은 법적 위반 행위입니다.");
	}
	
	public void onDisable(){
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player=(Player)sender;
		// TODO 자동 생성된 메소드 스텁
		if(command.getName().equals("야간투시")){
			if(player.isOp()){
				sender.sendMessage("OP 권한 확인 완료 (야간투시)이/가 무제한 적용됩니다.");
				player.addEffect(Effect.getEffect(Effect.NIGHT_VISION).setAmplifier(1).setDuration(20*86400));
			}
			else{
			sender.sendMessage("야간투시가 3분간 적용됩니다.");
			player.addEffect(Effect.getEffect(Effect.NIGHT_VISION).setAmplifier(1).setDuration(20*180));
			}
		}
		return true;
	}
}
