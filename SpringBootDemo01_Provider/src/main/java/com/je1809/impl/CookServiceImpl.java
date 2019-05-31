package com.je1809.impl;

import com.je1809.mapper.CookMapper;
import com.je1809.pojo.Article;
import com.je1809.pojo.Cook;
import com.je1809.pojo.CookExample;
import com.je1809.service.CookService;
import com.je1809.util.MsgResult;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CookServiceImpl implements CookService {

    @Resource
    private CookMapper cookMapper;

    private String url = "http://10.12.159.35:8082/solr";

    @Override
    public int countByExample(CookExample example) {
        return cookMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CookExample example) {
        return cookMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer cid) {
        return cookMapper.deleteByPrimaryKey(cid);
    }

    @Override
    public int insert(Cook record) {
        return cookMapper.insert(record);
    }

    @Override
    public int insertSelective(Cook record) {
        return cookMapper.insertSelective(record);
    }

    @Override
    public List<Cook> selectByExample(CookExample example) {
        return cookMapper.selectByExample(example);
    }

    @Override
    public Cook selectByPrimaryKey(Integer cid) {
        return cookMapper.selectByPrimaryKey(cid);
    }

    @Override
    public int updateByExampleSelective(Cook record, CookExample example) {
        return cookMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Cook record, CookExample example) {
        return cookMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Cook record) {
        return cookMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Cook record) {
        return cookMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Cook> cook3() {
        return cookMapper.cook3();
    }

    @Override
    public Cook CookUsers(Integer cid) {
        return cookMapper.CookUsers(cid);
    }

    @Override
    public MsgResult dataFromDB2Solr() {
        MsgResult msg = new MsgResult();

        List<Cook> cooks = cookMapper.selectByExample(null);

        HttpSolrServer server = new HttpSolrServer(url);

        SolrInputDocument sidoc = null;

        try {

            for(Cook s : cooks){
                sidoc = new SolrInputDocument();

                sidoc.setField("id", "cook_"+s.getCid());
                sidoc.setField("cook_cid", s.getCid());
                sidoc.setField("cook_uid", s.getUid());
                sidoc.setField("cook_cimg", s.getCimg());
                sidoc.setField("cook_descr", s.getDescr());
                sidoc.setField("cook_create_time", s.getCreateTime());
                sidoc.setField("cook_copycount", s.getCopycount());
                sidoc.setField("cook_lookcount", s.getLookcount());
                sidoc.setField("cook_remarks", s.getRemarks());
                sidoc.setField("cook_cbtid", s.getCbtid());
                sidoc.setField("cook_cname", s.getCname());

                server.add(sidoc);
            }

            server.commit();

            msg.setMsg("success");
            msg.setStatus(200);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return msg;
    }
}
