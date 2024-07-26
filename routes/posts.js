import express from "express";
import {getFeedPosts, getUserPosts, likePost} from "../controllers/posts.js";
import { verifyToken } from '../middleware/auth.js';
import { getUser } from "./users";


const router = express.Router();

/*READ*/

router.get("/",verifyToken, getFeedPosts);
/*making sure feedposts are found properly*/
router.get("/:userId/posts",verifyToken, getUserPosts);



/*UPDATE*/

router.patch("/:id/like",verifyToken, likePost);

export default router;