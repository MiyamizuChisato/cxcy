<template>
  <div>
    <meme-detail-head></meme-detail-head>
  </div>
  <t-divider/>
  <div>
    <md-editor preview-only v-model="text"/>
  </div>
</template>

<script>
import MdEditor from 'md-editor-v3';
import 'md-editor-v3/lib/style.css';
import MemeDetailHead from "../components/MemeDetailHead.vue";
import {onMounted, reactive, ref} from "vue";
import {getMemeByRand} from "../http";

export default {
  name: 'meme',
  components: {MemeDetailHead, MdEditor},
  setup() {
    let text = ref("")
    onMounted(async () => {
      const result = await getMemeByRand("/meme/get/rand")
      text.value = result.data.data.record.details
      console.log(text)
    })
    return {
      text
    }
  }
};
</script>

<style lang="less" scoped>
.action-text {
  display: inline-block;
  margin-left: 6px;
  line-height: 15px;
}

.author-icon {
  display: inline-block;
  margin: 0 4px;
}
</style>
