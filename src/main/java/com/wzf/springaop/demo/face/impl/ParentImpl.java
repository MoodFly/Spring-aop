package com.wzf.springaop.demo.face.impl;


import org.springframework.stereotype.Component;

import com.wzf.springaop.demo.face.Parent;

/**
 * @author wzf
 *
 */
@Component
public class ParentImpl implements Parent {

	public void doWork() {
		System.out.println("接受任务开始工作");
		try {
			for(int k=0;k<5;k++) {
				Thread.sleep(2000); 
				System.out.println("任务"+k+"进行完毕");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("干完了。。可以去撒欢了");
		System.out.println("从此开始砍柴，劈材喂马，面朝大海，春暖花开");
	}
	
	public void gotoShopping(){
		System.out.println("社会我狗哥。人狠话不多，杰克琼斯走一走。1千9百四十五。。。。开始购物");
		try {
			//模拟商城逛街
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("购物结束。。。。购物清单如下: 上衣 699 裤子599  两个T恤 499 一双鞋 299");
	}
	public void gotoWatchMovie(){
		System.out.println("最新的电影就要上线了: 我想去看。但是我想学习好纠结，快去看把。。。电影名称:红海行动");
		try {
			//模拟电影放映
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("看完了，，看的真特么好看");
	}

}
