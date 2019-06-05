### Facebook Phone Interview

1. 运气好抽到了非常直来直去的一题... 扯了挺长时间coding不到30min 一个n*m的字符grid, 判断里面是否包含一条path等于一个给定长为k的单词；只能上下左右走，不能重复 详细分析了时空复杂度，要求很精确的写出来 - dfs的方法是 O(nm * 4^k) 然后硬要improve space complexity, 还不能在原始char[][]里面标记，于是把visited boolean[][] 换成了 stack 最后问他fb的culture他说很反对move fast lol 

2. check Bipartite  马上想出BFS加set解，才开始写时间就到了

3. MERGE TWO SORTED ARRAY

4. 第一题找到一个二叉树最浅的根.BFS搜到没儿子的点就直接返回,秒了

5. 然后出了一道最基础的dfs。。。打印出所有从根节点到叶子的路径，我以为这只是一道热身题但是小哥就这么一道，问了各种时间空间复杂度 

6. 一道是输出给定String所有可能的subsequence。两题都秒了，结果第二题写的时候比较紧张，写了一个小bug，被指出后改正，然后就挂了。有点郁闷，但是没办法啦

   ```
   public static List subsequenceOfString(String s) { if (s == null || s.length() == 0) { return new LinkedList<>(); } Set set = new HashSet<>(); helper(s, set, new StringBuilder(), 0); List res = new LinkedList<>(set); return res; } public static void helper(String s, Set res, StringBuilder sb, int pos) { if (sb.length() != 0) { res.add(sb.toString()); } for (int i = pos; i < s.length(); i++) { sb.append(s.charAt(i)); helper(s, res, sb, i + 1); sb.deleteCharAt(sb.length() - 1); } }
   ```

7. 刚结束的video interview， 是个中国大叔，人很好，口语也很标准。迟到了三分钟，嘘寒问暖两分钟就开始做题。惊到了，竟然是一道LC没有的题。。。 给一个int, 输出所有 A + B = C + D 的unique index pairs, A B 下标不同，CD 下标不同， A B C D 输出以后，就不能输出C D B A了 但是可以ABDC 和BACD这种 写了一个O(N2)的用hashmap得到所有sum 相同的pairs的 lists，但是输出不知道怎么办，硬着头皮写了个O(N4)的，然后时间就到了。 问题环节问大叔说这个你们在日常工作中经常碰到吗，他笑着说不是， 但是很重要，比如你刚写的这个O(N4) is pretty bad…… 我看着他左边上扬右边不动的嘴角，我知道我应该move on 了。 求大米，希望大家能从我这里吸取经验。 另外LC没有找到这道题，希望大家能够给我个解法，更高效的，或者告知lc题号，蟹蟹https://instant.1point3acres.com/thread/286148

8. 第一题是判断一个数是不是完全平方数。 第二题是给一个list of intervals,and find the point where maximum intervals overlap. 面试官提示说类似于skyline problem那样用一个stack,但最后也没来得及完全想出来 


1. 一个array， 把所有非零元素移到开头，并返回非零元素的个数，follow up时间复杂度，交换次数 

2.  检查一个array，看能不能在one swap以内把它变成ascending order，刷题刷的不够，感觉没有印象 觉得不能冷场，先说用stack（举了个例子后被否决了），然后看着题目中的例子凭直觉说用two pointers，还好work了。。。。 follow up： 时间复杂度 check if can be fixed in ascending order or descending order 每道题都问了时间复杂度，口头跑了cases 

   链接: <https://instant.1point3acres.com/thread/284681>
   来源: 一亩三分地

   ​

链接: <https://instant.1point3acres.com/thread/284681>
来源: 一亩三分地

链接: <https://instant.1point3acres.com/thread/284681>
来源: 一亩三分地

链接: <https://instant.1point3acres.com/thread/284681>
来源: 一亩三分地

### FACEBOOK ONSITE

1. 第一面：isValidBST

2. 第二面：奇葩字符串比较（a22第三面：Behavior + 不用除法的除法（int范围，求商和余数）

3. 第一轮, 字符串自然顺序比较, “a11” > “a2”, 面试官就很笼统的说一个例子, 很多东西得你自己去clarify, overflow or not什么的. 写着很麻烦, 和这个兄弟的第一轮一样, 作者需要拥有至少50积分以显示此链接. 不过还是写完了, 口头run case也过了. 就是过程很坎坷, 写的过程中, 出了很多小错误, 因为需要考虑的case很多, 外加白板, 改起来及其不方便, 所以各位兄弟一定想好了在写. 第二轮, 前25min bq, 问一些 队友冲突, 你为啥想要做这个Proj, 具体技术细节, proj有哪些提高的地方, 为啥不提高, 你的trade off是什么. 还有一些其他的忘了, 剩下20min, 写了一道decode ways 2(冒冷汗, 幸亏是个面经题目) 第三轮, 机器人走房间, 不想多说什么, 总体的idea是对的, 但是最后面试官说你有个地方不对好好想想, 然后就把move back加上了. 然后就结束了. 

4.  第一轮求树的最长距离 第二轮move 0s

5. 题目是给你一个机器人和一个房间，你并不知道机器人在房间什么位置，你也不知道房间的形状大小，你有一个遥控器，可以让机器人走前后左右四个方向。这里给你一个move method : boolean move(int direction), direction: 0,1,2,3 表示四个方向。能移动就返回true,不能移动表示false。问你：这个房间多大。 

6. 利口吴柳林，只要求返回true/false, 两种解hashmap + two pointers 秒了， 第二题 decode ways 3. 设计一个online musice service的两个API， API1: record user listen to song, API2: return top 10 songs played by any user. 4. read4k， 这轮妥妥跪，就一道题。 lz一开始用queue实现了，面试官指出 memory copy 了三次，分别是 readbuf->queue->buf，其中queue是多余的，让去除掉, 只做两次memo copy。我写代码实现了。然后又说其实readbuf也可以去掉，讨论之后我指出在n%(4k) == 0 可以不要readbuf。剩下10min不够写第二题，楼主急了，但是面试官仍然自high着乱扯了下别的，就没时间啦，让楼主提问！ 然后lz就跪了。。。 

   链接: <https://instant.1point3acres.com/thread/286839>
   来源: 一亩三分地

7. 上周onsite 目测跪了 emmmm 发点之前整理的资料吧 已经不想再看见他们了 森气 说一下自己的题 反正要跪也没关系啦 第一轮就是BQ + 股票题 tag里的 中国小哥 口语不错 第二轮一道新题 给俩数组里面全是interval 求merge 之后让求最优解 越南人，不得不说口音一股pho味 好多不知道说啥。。(这里 fb停电了。。摸黑讲题 没让写 就是一直在讨论 fb也会停电也是挺神奇的… 第三轮数字英语，除两个数 烙印大叔 (依旧停电但是换了一个屋子 这个大叔挺可爱的。。先问了我简历我说这不可能又是 BQ吧 我秒写完了他问我咋想的2333 不知道feedback会不会觉得我做过 但是都挂了不想了 move on~ 下周应该会收到拒信啦。。无所谓了 本来就没抱希望 虽然真的把fb的面经和tag都刷烂了 脸都刷大了一圈 but 生死有命富贵在天嘛 2333 希望大家都好运 尽早找工 别像我都毕业

   链接: <https://instant.1point3acres.com/thread/285228>
   来源: 一亩三分地

8. 没 第二轮老美system design，要求design twitter。基本上我就照搬了现成的twitter架构(fan out)，谈到遇到celebrity可以改成pull。我觉得这个design也被说烂了吧，个人觉得无功无过。第四轮BQ，老印各种反复问题。。。最后一个查找有序数组数字出现频率结束。老印表示对我用upper_bound不爽，然后要我实现。哎，早知就直接二分了，实现upper_bound还要用template，反正自己给自己挖了坑。 过了两天hr就说挂了，没送hc也不肯给理由，我觉得估计就是老印下了点绊吧。自己也没做到code完美，只是面完无知地觉得还ok，结果就是个悲剧。大家打赏点分吧，继续攒rp！

   链接: <https://instant.1point3acres.com/thread/286375>
   来源: 一亩三分地

9. 问了一道design题。privacy setting. 说是user可以发Post, 问如何设计friends可见后来follow up 问如何设计user朋友的朋友也可见，我说先找user的朋友，再找user朋友的朋友，他说这样就O(N^2)了，问有没有O(N)来设计friend of friend可见的方法？ 不知道怎么答了。。

   链接: <https://instant.1point3acres.com/thread/259484>
   来源: 一亩三分地